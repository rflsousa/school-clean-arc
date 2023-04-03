package org.example.school.domain.recommendation.student;

import java.util.List;

public interface StudentRepository {

    void enroll(Student student);

    Student findByDocument(Document document);

    List<Student> listAllEnrolledStudents();
}
