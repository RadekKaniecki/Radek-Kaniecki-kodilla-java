package com.kodilla.good.patterns.challenge2;

public class User {
    private String name;
    private String surname;
    private String mailAddress;

    public User(String name, String surname, String mailAddress) {
        this.name = name;
        this.surname = surname;
        this.mailAddress = mailAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String toString() {
        return this.name + " " + this.surname + ", " + this.mailAddress;
    }
}
