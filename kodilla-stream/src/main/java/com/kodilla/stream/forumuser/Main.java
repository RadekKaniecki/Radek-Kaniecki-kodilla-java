package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.generateRandomUsers(50);

        Map<Integer, ForumUser> userMap = forum.getListOfUsers().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 1997)
                .filter(forumUser -> forumUser.getPublishedPostsAmount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserIdentifier, forumUser -> forumUser));

        System.out.println("# of users: " + forum.getListOfUsers().size());
        System.out.println("================");
        userMap.entrySet().stream()
                .map(entry -> entry.getKey() + "." + entry.getValue() + "\n")
                .forEach(System.out::println);

    }
}
