package com.kodilla.testing.collection;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing" + listNumbers);
        //Then
        assertEquals(emptyList, listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(34, 777, 22, 199, 18, 15, 3, 12, 4));
        ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(34, 22, 18, 12, 4));

        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);
        //Then
        assertEquals(oddList, listNumbers);
    }
}