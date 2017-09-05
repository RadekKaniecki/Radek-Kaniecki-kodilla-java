package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(5.2, 8.6);
        } catch (Exception e) {
            System.out.println("Problem with method!");
        }
    }
}
