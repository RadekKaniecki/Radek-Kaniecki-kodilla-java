package com.kodilla.testing.forum;

import org.junit.*;
import com.kodilla.testing.user.SimpleUser;

public class ForumTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: begin.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite: end.");
    }

    @Before
    public void before() {
        System.out.println("Test case: begin.");
    }

    @After
    public void after() {
        System.out.println("Test case: end.");
    }

    @Test
    public void testCaseUserName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUserName();
        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testRealUserName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        //Then
        Assert.assertEquals("John Smith", result);
    }

}
