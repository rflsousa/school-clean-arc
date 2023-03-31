package org.example.school;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Document document;
    private String name;
    private Email email;
    private List<Phone> phones = new ArrayList<>();

    public Student(Document document, String name, Email email) {
        this.document = document;
        this.name = name;
        this.email = email;
    }

    public void addPhone(String dialingCode, String number){
        this.phones.add(new Phone(dialingCode, number));
    }

}
