package org.example;

import org.example.school.application.student.enroll.EnrollStudent;
import org.example.school.application.student.enroll.EnrollStudentDto;
import org.example.school.infrastructure.student.StudentRepositoryInMemory;

public class EnrollStudentByCommandLine {
    public static void main(String[] args) {
        String name = "Peter Parker";
        String document = "123.456.789-00";
        String email = "pparker@email.com";

        EnrollStudent enrollStudent = new EnrollStudent(new StudentRepositoryInMemory());
        enrollStudent.execute(new EnrollStudentDto(name, document, email));
    }
}