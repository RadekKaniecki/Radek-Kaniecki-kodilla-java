package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.naming.NameNotFoundException;
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
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = 0;

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
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(200, averagePostsPerUser, 0.001);
        Assert.assertEquals(2, averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.01, averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateStatisticsWithZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("A");
        usersNames.add("B");
        usersNames.add("C");
        usersNames.add("D");
        usersNames.add("E");

        int postsAmount = 10;
        int commentsAmount = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmount);
        when(statisticsMock.postsCount()).thenReturn(postsAmount);

        Calculate calculate = new Calculate(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(2, averagePostsPerUser, 0.001);
        Assert.assertEquals(0, averageCommentsPerUser, 0.001);
        Assert.assertEquals(0, averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateStatisticsWithPostAmountGreaterThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("A");
        usersNames.add("B");
        usersNames.add("C");
        usersNames.add("D");
        usersNames.add("E");

        int postsAmount = 100;
        int commentsAmount = 10;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmount);
        when(statisticsMock.postsCount()).thenReturn(postsAmount);

        Calculate calculate = new Calculate(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(20, averagePostsPerUser, 0.001);
        Assert.assertEquals(2, averageCommentsPerUser, 0.001);
        Assert.assertEquals(0.1, averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateStatisticsWithPostAmountLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("A");
        usersNames.add("B");
        usersNames.add("C");
        usersNames.add("D");
        usersNames.add("E");

        int postsAmount = 10;
        int commentsAmount = 100;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmount);
        when(statisticsMock.postsCount()).thenReturn(postsAmount);

        Calculate calculate = new Calculate(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(2, averagePostsPerUser, 0.001);
        Assert.assertEquals(20, averageCommentsPerUser, 0.001);
        Assert.assertEquals(10, averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateStatisticsWithZeroUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        int postsAmount = 10;
        int commentsAmount = 10;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmount);
        when(statisticsMock.postsCount()).thenReturn(postsAmount);

        Calculate calculate = new Calculate(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = 0;
        double averageCommentsPerUser = 0;
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averagePostsPerUser, 0.001);
        Assert.assertEquals(0, averageCommentsPerUser, 0.001);
        Assert.assertEquals(1, averageCommentsPerPost, 0.001);
    }

    @Test
    public void testCalculateStatisticsWith100Users() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i=0; i<100; i++) {
            usersNames.add("User #" + i);
        }

        int postsAmount = 10;
        int commentsAmount = 10;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsAmount);
        when(statisticsMock.postsCount()).thenReturn(postsAmount);

        Calculate calculate = new Calculate(statisticsMock);
        calculate.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0.1, averagePostsPerUser, 0.001);
        Assert.assertEquals(0.1, averageCommentsPerUser, 0.001);
        Assert.assertEquals(1, averageCommentsPerPost, 0.001);
    }
}
