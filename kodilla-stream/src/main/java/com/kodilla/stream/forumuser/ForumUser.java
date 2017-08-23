package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private static int identifierCount = 0;
    private int userIdentifier;
    private String userName;
    private char sex;
    private LocalDate birthDate;
    private int publishedPostsAmount;

    public ForumUser(String userName, char sex, int year, int month, int day, int publishedPostsAmount) {
        identifierCount++;
        this.userIdentifier =identifierCount;
        this.userName = userName;

        if(sex == 'M') {
            this.sex = 'M';
        }else if(sex == 'F') {
            this.sex = 'F';
        }else {
            this.sex = '-';
        }

        if((year >= 1900 && year <= 2017 ) && (month > 0 && month <= 12) && (day > 0 && day <= 31)) {
            if((month == 2) && (day > 28)) {
                this.birthDate = LocalDate.of(year, month, 28);
            }else {
                this.birthDate = LocalDate.of(year, month, day);
            }
        }else {
            this.birthDate = LocalDate.of(1900, 1, 1);
        }

        this.publishedPostsAmount = publishedPostsAmount;
    }

    public int getUserIdentifier() {
        return userIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostsAmount() {
        return publishedPostsAmount;
    }

    public String toString() {
        return "\nName: " + this.userName +
                "\nSex: " + this.sex +
                "\nBirth date: " + this.birthDate.toString() +
                "\nPosts amount: " + this.publishedPostsAmount;
    }
}
