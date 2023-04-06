package org.example.school.application.student.enroll;

import org.example.school.domain.student.Document;
import org.example.school.domain.student.Email;
import org.example.school.domain.student.Student;

public class EnrollStudentDto {

    private String name;
    private String document;
    private String email;

    public EnrollStudentDto(String name, String document, String email) {
        this.name = name;
        this.document = document;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Student createStudent(){
        return new Student(new Document(this.document), this.name, new Email(this.email));
    }
}
