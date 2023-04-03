package org.example.school.domain.recommendation.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Document document;
    private String name;
    private Email email;
    private List<Phone> phones = new ArrayList<>();

    private String password;

    public Student(Document document, String name, Email email) {
        this.document = document;
        this.name = name;
        this.email = email;
    }

    public void addPhone(String dialingCode, String number){
        this.phones.add(new Phone(dialingCode, number));
    }

    public String getDocument() {
        return document.getNumber();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getAddress();
    }

    public List<Phone> getPhones() {
        return phones;
    }
}
