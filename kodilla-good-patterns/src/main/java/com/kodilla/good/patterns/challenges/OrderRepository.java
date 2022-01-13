package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Map;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from, String deliveryMethod, Map<String, Integer> orderedProduct);
}
