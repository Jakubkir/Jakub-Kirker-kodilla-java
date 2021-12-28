package com.kodilla.good.patterns.food2Door;

public class Applications {
    public static void main(String[] args) {
        DeliveryProcess deliveryProcess = new DeliveryProcess
                ("Extra Food Shop","apple", 20, "kg");
        Request request = new Request();
        request.order(deliveryProcess);
    }
}
