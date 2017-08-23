package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forum {
    private List<ForumUser> listOfUsers;

    public Forum() {
        this.listOfUsers = new ArrayList<>();
    }

    public List<ForumUser> getListOfUsers() {
        return listOfUsers;
    }

    public void generateRandomUsers(int numberOfUsers) {
        Random rand = new Random();
        char sex;
        LocalDate birthDate;


        for(int i=0; i<numberOfUsers; i++) {
            int generateSex = rand.nextInt(2);
            if(generateSex == 0) {
                sex = 'M';
            }else {
                sex = 'F';
            }

            int year = rand.nextInt((2017 - 1950) + 1) + 1950;
            int month = rand.nextInt((12 - 1) + 1) + 1;
            int day = rand.nextInt((30-1) + 1) + 1;

            int publishedPostsAmount = rand.nextInt(50) + 1;

            listOfUsers.add(new ForumUser(("User #" + (i+1)), sex, year, month, day, publishedPostsAmount));
        }
    }
}
