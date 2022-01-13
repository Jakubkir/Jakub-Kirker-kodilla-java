package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Map;

public class ProductOrderRepository implements OrderRepository{
    public void createOrder(User user, LocalDateTime from, String deliveryMethod, Map<String, Integer> orderedProduct) {
        System.out.println("New Order is accepted and adding to the system");
    }
}
