package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SeafoodPizzaDecorator extends AbstractPizzaOrderDecorator{
    public SeafoodPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + shrimp";
    }
}