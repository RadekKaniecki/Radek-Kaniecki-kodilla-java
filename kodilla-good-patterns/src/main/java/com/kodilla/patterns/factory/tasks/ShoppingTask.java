package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private boolean isExecuted;
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.isExecuted = false;
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
