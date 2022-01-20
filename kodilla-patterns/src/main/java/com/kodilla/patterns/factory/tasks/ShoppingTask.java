package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantuty;

    public ShoppingTask(String taskName, String whatToBuy, double quantuty) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantuty = quantuty;
    }

    @Override
    public String executeTask() {
        return  "Task is executed";
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantuty() {
        return quantuty;
    }
}
