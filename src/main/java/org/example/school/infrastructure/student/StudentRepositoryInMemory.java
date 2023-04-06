package org.example.school.infrastructure.student;

import org.example.school.domain.student.Document;
import org.example.school.domain.student.Student;
import org.example.school.domain.student.StudentNotFound;
import org.example.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {

    private List<Student> enrolled = new ArrayList<>();

    @Override
    public void enroll(Student student) {
        this.enrolled.add(student);
    }

    @Override
    public Student findByDocument(Document document) {
        return this.enrolled.stream()
                .filter(s -> s.getDocument().equals(document.getNumber()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(document));
    }

    @Override
    public List<Student> listAllEnrolledStudents() {
        return this.enrolled;
    }
}
