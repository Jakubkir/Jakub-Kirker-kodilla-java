package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DeepPanPizzaDecorator extends AbstractPizzaOrderDecorator {
    public DeepPanPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " + deep pan";
    }
}