package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    private static int testNumber = 0;

    @Before
    public void before() {
        testNumber++;
        System.out.println("Test #" + testNumber + ": begin.");
    }

    @After
    public void after() {
        System.out.println("Test #" + testNumber + ": end.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator obj = new OddNumbersExterminator();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> exterminatedList = obj.exterminate(list);
        ArrayList<Integer> correctEmptyList = new ArrayList<>();

        Assert.assertEquals(correctEmptyList, exterminatedList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator obj = new OddNumbersExterminator();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ArrayList<Integer> correctList = new ArrayList<>();
        correctList.add(2);
        correctList.add(4);
        correctList.add(6);

        ArrayList<Integer> exterminatedList = obj.exterminate(list);
        Assert.assertEquals(correctList, exterminatedList);
    }


}
