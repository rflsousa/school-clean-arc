package org.example.school.domain.recommendation.student;

public class StudentNotFound  extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public StudentNotFound(Document document){
        super("Student not found with document: " + document.getNumber());
    }
}
