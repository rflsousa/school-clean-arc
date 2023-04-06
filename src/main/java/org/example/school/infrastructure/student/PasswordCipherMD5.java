package org.example.school.infrastructure.student;

import org.example.school.domain.student.PasswordCipher;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordCipherMD5 implements PasswordCipher {
    @Override
    public String cipherPassword(String password) {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < bytes.length; i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("Error while generating hash password!");
        }

    }

    @Override
    public boolean validadePassword(String ciphedPassword, String password) {
        return ciphedPassword.equals(cipherPassword(password));
    }
}
