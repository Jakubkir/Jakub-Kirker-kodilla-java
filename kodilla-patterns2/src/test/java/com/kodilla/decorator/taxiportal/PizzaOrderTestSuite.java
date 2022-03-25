package com.kodilla.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testHawaiiPizzaWithExtraCheeseGetPrice() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HawaiiPizzaDecorator(order);
        order = new ExtraCheeseDecorator(order);
        //When
        BigDecimal price = order.getPrice();
        //Then
        assertEquals(new BigDecimal(22), price);
    }

    @Test
    public void testHawaiiPizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HawaiiPizzaDecorator(order);
        order = new ExtraCheeseDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Basic pizza + ham & pineapple + extra cheese", description);
    }

    @Test
    public void testSeafoodPizzaWithExtraCheeseAndDeepPanGetPrice() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new SeafoodPizzaDecorator(order);
        order = new ExtraCheeseDecorator(order);
        order = new DeepPanPizzaDecorator(order);
        //When
        BigDecimal price = order.getPrice();
        //Then
        assertEquals(new BigDecimal(29), price);
    }

    @Test
    public void testSeafoodPizzaWithExtraCheeseAndDeepPanGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new SeafoodPizzaDecorator(order);
        order = new ExtraCheeseDecorator(order);
        order = new DeepPanPizzaDecorator(order);
        //When
        String description=order.getDescription();
        //Then
        assertEquals("Basic pizza + shrimp + extra cheese + deep pan", description);
    }
}