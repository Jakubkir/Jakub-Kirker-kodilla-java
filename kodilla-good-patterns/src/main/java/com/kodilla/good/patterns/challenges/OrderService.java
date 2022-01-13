package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Map;

public interface OrderService {
    boolean order(User user, LocalDateTime from, String deliveryMethod, Map<String, Integer> orderedProduct);
}
