package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
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

        int postsCount = 0;
        int commentsCount = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        Calculate calculate = new Calculate(statisticsMock);

        //When
        double averagePostsPerUser = calculate.getAveragePostsPerUser();
        double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
        double averageCommentsPerPost = calculate.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averagePostsPerUser);
        Assert.assertEquals(0, averageCommentsPerUser);
        Assert.assertEquals(0, averageCommentsPerPost);
    }
}
