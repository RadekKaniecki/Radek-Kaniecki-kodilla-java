package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ExerciseQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> exercises;
    private final String userName;

    public ExerciseQueue(String userName) {
        this.observers = new ArrayList<>();
        this.exercises = new ArrayList<>();
        this.userName = userName;
    }

    public void addExercise(String exerciseName) {
        exercises.add(exerciseName);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getUserName() {
        return userName;
    }
}
