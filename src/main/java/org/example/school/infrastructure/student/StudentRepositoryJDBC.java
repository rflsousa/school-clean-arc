package org.example.school.infrastructure.student;

import org.example.school.domain.student.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryJDBC implements StudentRepository {

    private final Connection connection;

    public StudentRepositoryJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void enroll(Student student) {
        try {
            String sql = "INSERT INTO STUDENT VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getDocument());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.execute();

            sql = "INSERT INTO PHONE VALUES(?, ?)";
            ps = connection.prepareStatement(sql);
            for (Phone phone : student.getPhones()){
                ps.setString(1, phone.getDialingCode());
                ps.setString(2, phone.getNumber());
                ps.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findByDocument(Document document) {
        try{
            String sql = "SELECT id, name, email FROM STUDENT WHERE document_number = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, document.getNumber());

            ResultSet rs = ps.executeQuery();
            boolean find = rs.next();
            if(!find){
                throw new StudentNotFound(document);
            }

            String name = rs.getString("name");
            Email email = new Email(rs.getString("email"));
            Student studentFound = new Student(document, name, email);

            Long id = rs.getLong("id");
            sql = "SELECT dialing_code, number FROM PHONE WHERE student = ?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String number = rs.getString("number");
                String dialingCode = rs.getString("dialing_code");
                studentFound.addPhone(dialingCode, number);
            }
            return studentFound;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> listAllEnrolledStudents() {

        try{
            String sql = "SELECT id, document, name, email FROM STUDENT";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Student> students = new ArrayList<>();
            while (rs.next()){
                Document document = new Document(rs.getString("document"));
                String name = rs.getString("name");
                Email email = new Email(rs.getString("email"));
                Student student = new Student(document, name, email);

                Long id = rs.getLong("id");
                sql = "SELECT dialing_code, number FROM PHONE WHERE student_id = ?";
                PreparedStatement psPhone = connection.prepareStatement(sql);
                psPhone.setLong(1, id);
                ResultSet rsPhone = psPhone.executeQuery();
                while (rsPhone.next()){
                    String number = rsPhone.getString("number");
                    String dialingCode = rsPhone.getString("dialing_code");
                    student.addPhone(dialingCode, number);
                }
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
