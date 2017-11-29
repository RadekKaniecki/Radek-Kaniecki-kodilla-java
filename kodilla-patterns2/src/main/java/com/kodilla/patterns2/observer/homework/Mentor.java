package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(ExerciseQueue exerciseQueue) {
        System.out.println(mentorName + ": New exercise added by " + exerciseQueue.getUserName()
            + "\n(total: " + exerciseQueue.getExercises().size() + " exercises)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
