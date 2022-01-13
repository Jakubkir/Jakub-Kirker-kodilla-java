package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Map;

public class ProductOrderService implements  OrderService {
    public boolean order(User user, LocalDateTime form, String deliveryMethod, Map<String, Integer> orderedProduct){
        return true;
    }
}
