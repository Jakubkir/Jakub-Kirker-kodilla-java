package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequestRetriever {
    public OrderRequest retvieve() {
        User user = new User ("Jakub", "Nowak","Brzezie Narodowa 83a");
        LocalDateTime orderFrom = LocalDateTime.of(2021,12,20,21,51);
        String deliveryMethod = "Paczkomat Inpost";
        Map<String, Integer> orderedProduct = Map.of(
                "Lego", 2,
                "Auto", 1
        );

        return new OrderRequest(user,orderFrom, deliveryMethod, orderedProduct);
    }
}
