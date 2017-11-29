package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ExerciseQueue johnSmith = new ExerciseQueue("John Smith");
        ExerciseQueue jessiePinkman = new ExerciseQueue("Jessie Pinkman");
        ExerciseQueue walterWhite = new ExerciseQueue("Walter White");
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");
        johnSmith.registerObserver(mentor1);
        jessiePinkman.registerObserver(mentor1);
        walterWhite.registerObserver(mentor2);
        //When
        jessiePinkman.addExercise("Exercise 1");
        johnSmith.addExercise("Exercise 1");
        walterWhite.addExercise("Exercise 1");
        jessiePinkman.addExercise("Exercise 2");
        walterWhite.addExercise("Exercise 2");
        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
