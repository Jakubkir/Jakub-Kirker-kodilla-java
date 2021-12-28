package com.kodilla.good.patterns.food2Door;

public class DeliveryProcess {
    private static String foodProducent;
    String product;
    int quantity;
    String unit;

    public DeliveryProcess(String foodProducent, String product, int quantity, String unit) {
        this.foodProducent = foodProducent;
        this.product = product;
        this.quantity = quantity;
        this.unit = unit;
    }

    public static String getFoodProducent() {
        return foodProducent;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
