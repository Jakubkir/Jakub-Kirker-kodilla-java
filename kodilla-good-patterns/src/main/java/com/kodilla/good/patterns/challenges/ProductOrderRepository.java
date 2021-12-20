package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{
    public void createOrder(User user, LocalDateTime from, String deliveryMethod) {
        System.out.println("New Order is accepted and adding to the system");
    }
}
