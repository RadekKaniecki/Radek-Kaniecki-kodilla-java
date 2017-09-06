package com.kodilla.good.patterns.challenge2;

public class EmailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sending mail with confirmation to user: " + user.getSurname() + ", " + user.getName() +
            "\nOn email address: " + user.getMailAddress() + "\n");
    }
}
