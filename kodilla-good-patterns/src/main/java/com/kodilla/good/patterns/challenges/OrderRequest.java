package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime from;
    private String deliveryMethod;

    public OrderRequest(User user, LocalDateTime from, String deliveryMethod) {
        this.user = user;
        this.from = from;
        this.deliveryMethod = deliveryMethod;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }
}
