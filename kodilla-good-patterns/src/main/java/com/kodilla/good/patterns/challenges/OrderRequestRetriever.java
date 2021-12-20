package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retvieve() {
        User user = new User ("Jakub", "Nowak","Brzezie Narodowa 83a");
        LocalDateTime orderFrom = LocalDateTime.of(2021,12,20,21,51);
        String deliveryMethod = "Paczkomat Inpost";

        return new OrderRequest(user,orderFrom, deliveryMethod);
    }
}
