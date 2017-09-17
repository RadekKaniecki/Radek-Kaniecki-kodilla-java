package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Millenials");
        User user2 = new YGeneration("YGeneration");
        User user3 = new ZGeneration("ZGeneration");

        //When
        String millenialsSocialNetwork = user1.getSocialPublisher().share();
        System.out.println("Millenials - " + millenialsSocialNetwork);

        String yGenerationSocialNetwork = user2.getSocialPublisher().share();
        System.out.println("YGeneration - " + yGenerationSocialNetwork);

        String zGenerationSocialNetwork = user3.getSocialPublisher().share();
        System.out.println("ZGeneration - " + zGenerationSocialNetwork);

        //Then
        Assert.assertEquals("Your favourite social network is Facebook", millenialsSocialNetwork);
        Assert.assertEquals("Your favourite social network is Twitter", yGenerationSocialNetwork);
        Assert.assertEquals("Your favourite social network is Snapchat", zGenerationSocialNetwork);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Millenials");

        //When
        String millenialsSocialNetwork = user1.getSocialPublisher().share();
        System.out.println("Millenials current social network - " + millenialsSocialNetwork);

        user1.setSocialPublisher(new SnapchatPublisher());
        millenialsSocialNetwork = user1.getSocialPublisher().share();
        System.out.println("Millenials new social network - " + millenialsSocialNetwork);

        //Then
        Assert.assertEquals("Your favourite social network is Snapchat", millenialsSocialNetwork);

    }
}
