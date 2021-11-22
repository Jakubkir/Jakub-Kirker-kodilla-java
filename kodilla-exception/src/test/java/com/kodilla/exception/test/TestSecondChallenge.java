package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSecondChallenge {
    @Test
    void testprobablyIWillThrowException() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When and Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 4));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
    }
}
