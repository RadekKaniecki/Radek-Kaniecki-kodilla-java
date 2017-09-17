package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public Task createTask(String taskName) {
        switch (taskName) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping task", "eggs", 10.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "red", "walls");
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "home", "car");
            default:
                return null;
        }
    }
}
