package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private boolean isExecuted;
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.isExecuted = false;
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if(!isExecuted) {
            isExecuted = true;
            System.out.println("Taks is executed.");
        }else {
            System.out.println("Your task is already executed.");
        }
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.isExecuted;
    }
}
