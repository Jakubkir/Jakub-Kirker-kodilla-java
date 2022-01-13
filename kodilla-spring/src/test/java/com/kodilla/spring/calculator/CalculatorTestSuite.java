package com.kodilla.spring.calculator;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAddMethod(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.add(7.8,2.2);
        //Then
        assertEquals(10.0, val, 0.00001);
    }
    @Test
    public void testsubBfromAMethod(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.subBfromA(7.8,2.2);
        //Then
        assertEquals(5.6, val, 0.00001);
    }
    @Test
    public void testMulMethod(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.mul(7.8,2.2);
        //Then
        assertEquals(17.16, val, 0.00001);
    }
    @Test
    public void testDivAbyBNot0Method(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.divAbyB(7.8,2.2);
        //Then
        assertEquals(3.54545, val, 0.00001);
    }
    @Test
    public void testDivAbyBMethod(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.divAbyB(7.8,0);
        //Then
        assertEquals(-1, val, 0.00001);
    }
    }

