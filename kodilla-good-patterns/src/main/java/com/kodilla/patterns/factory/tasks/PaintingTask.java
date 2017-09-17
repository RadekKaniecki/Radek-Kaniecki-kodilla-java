package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private boolean isExecuted;
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.isExecuted = false;
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
