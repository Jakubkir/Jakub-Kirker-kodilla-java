package com.kodilla.good.patterns.food2Door;

public class Request {

    public void order(DeliveryProcess deliveryProcess) {
        try {
            FoodProducent name = FindProducent.find(DeliveryProcess.getFoodProducent());
            boolean isAceppted = name.process(deliveryProcess.getFoodProducent(),
                    deliveryProcess.getProduct(),
                    deliveryProcess.getQuantity(),
                    deliveryProcess.getUnit());

            if (isAceppted) {
                System.out.println("Delivery is aceppted");
            } else {
                System.out.println("Delivery order rejected");
            }
        } catch (NoFoodProducentFind e) {
            System.out.println("Supplier not found");
        }
    }
}
