package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        assertTrue(drivingTask.isTaskExecuted());
        assertEquals("Task is executed", drivingTask.executeTask());
        assertTrue(drivingTask.isTaskExecuted());

    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        assertFalse(shoppingTask.isTaskExecuted());
        assertEquals("Task is executed", shoppingTask.executeTask());
        assertFalse(shoppingTask.isTaskExecuted());

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        assertTrue(paintingTask.isTaskExecuted());
        assertEquals("Task is executed", paintingTask.executeTask());
        assertTrue(paintingTask.isTaskExecuted());

    }

}
