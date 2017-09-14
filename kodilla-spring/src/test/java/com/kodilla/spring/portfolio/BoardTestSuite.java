package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("This is to do.");
        board.getInProgressList().getTasks().add("This is in progress.");
        board.getDoneList().getTasks().add("This is done.");
        //Then
        Assert.assertEquals("This is to do.", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("This is in progress.", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("This is done.", board.getDoneList().getTasks().get(0));
    }
}
