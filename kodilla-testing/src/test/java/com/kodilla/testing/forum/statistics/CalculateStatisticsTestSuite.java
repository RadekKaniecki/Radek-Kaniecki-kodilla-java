package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    static int numberOfTests = 0;

    @Before
    public void beforeEachTest() {
        numberOfTests++;
        System.out.println("Performing test #" + numberOfTests);
    }

    @Test
    public void testCalculateStatisticsWithZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("A");
        usersNames.add("B");
        usersNames.add("C");
        usersNames.add("D");
        usersNames.add("E");

        int postsAmount = 0;
        int commentsAmount = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmount);
        when(statisticsMock.postsCount()).thenReturn(postsAmount);

        Calculate calculate = new Calculate(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averagePostsPerUser, 0.001);
        Assert.assertEquals(0, averageCommentsPerUser, 0.001);
        Assert.assertEquals(0, averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateStatisticsWith1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("A");
        usersNames.add("B");
        usersNames.add("C");
        usersNames.add("D");
        usersNames.add("E");

        int postsAmount = 1000;
        int commentsAmount = 10;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmount);
        when(statisticsMock.postsCount()).thenReturn(postsAmount);

        Calculate calculate = new Calculate(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(200, averagePostsPerUser, 0.001);
        Assert.assertEquals(2, averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.005, averageCommentsPerPost, 0.001);
    }
}
