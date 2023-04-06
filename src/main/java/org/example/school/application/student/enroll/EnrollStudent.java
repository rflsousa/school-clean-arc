package org.example.school.application.student.enroll;

import org.example.school.domain.student.Student;
import org.example.school.domain.student.StudentRepository;

public class EnrollStudent {

    private final StudentRepository repository;

    public EnrollStudent(StudentRepository repository) {
        this.repository = repository;
    }

    public void execute(EnrollStudentDto enrollStudentDto) {
        Student student = enrollStudentDto.createStudent();
        repository.enroll(student);
    }
}
