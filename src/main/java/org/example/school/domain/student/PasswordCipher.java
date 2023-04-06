package org.example.school.domain.student;

public interface PasswordCipher {

    String cipherPassword(String password);
    boolean validadePassword(String ciphedPassword, String password);
}
