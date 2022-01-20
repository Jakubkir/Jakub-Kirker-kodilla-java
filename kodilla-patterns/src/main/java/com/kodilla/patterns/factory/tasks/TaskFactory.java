package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return (Task) new DrivingTask("Task1", "Krakow", "Face");
            case PAINTINGTASK:
                return (Task) new PaintingTask("Task2", "Red", "Cat");
            case SHOPPINGTASK:
                return (Task) new ShoppingTask("Task3", "Pen", 2.50);
            default:
                return null;
        }
    }
}
