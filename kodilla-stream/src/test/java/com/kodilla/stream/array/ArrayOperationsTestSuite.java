package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {3,4,2,2,1};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(2.4, average, 0);
    }
}
