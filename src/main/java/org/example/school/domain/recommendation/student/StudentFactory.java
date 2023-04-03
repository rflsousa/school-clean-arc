package org.example.school.domain.recommendation.student;

public class StudentFactory {

    private Student student;

    public StudentFactory withNameDocumentEmail(String name, String document, String email) {
        this.student = new Student(new Document(document), name, new Email(email)
        );
        return this;
    }

    public StudentFactory withPhone(String dialingCode, String number) {
        this.student.addPhone(dialingCode, number);
        return this;
    }

    public Student create() {
        return this.student;
    }
}
