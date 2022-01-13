package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        //Given
        Logger.getInstance();
        //When
        Logger.getInstance().log("log entry 1");
        Logger.getInstance().log("log entry 2");
        //Then
        Assertions.assertEquals("log entry 2", Logger.getInstance().getLastLog());
    }
}
