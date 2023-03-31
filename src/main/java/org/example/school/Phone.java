package org.example.school;

public class Phone {
    private String dialingCode;
    private String number;

    public Phone(String dialingCode, String number) {
        if(dialingCode == null || number == null){
            throw new IllegalArgumentException("Dialing code and number are mandatory!");
        }

        if(!dialingCode.matches("\\d{2}")){
            throw new IllegalArgumentException("Invalid dialing code!");
        }

        if(!number.matches("\\d{8}|\\d{9}")){
            throw new IllegalArgumentException("Invalid dialing code!");
        }

        this.dialingCode = dialingCode;
        this.number = number;
    }

    public String getDialingCode() {
        return dialingCode;
    }

    public void setDialingCode(String dialingCode) {
        this.dialingCode = dialingCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
