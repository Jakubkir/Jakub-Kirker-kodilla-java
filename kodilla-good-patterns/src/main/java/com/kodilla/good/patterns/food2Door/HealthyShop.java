package com.kodilla.good.patterns.food2Door;

public class HealthyShop implements FoodProducent {
    @Override
    public boolean process(String foodProducent, String product, int quantity, String unit) {

        if (unit != null) {
            System.out.println("The " + foodProducent + " can delivery product.");
            return true;
        } else {
            System.out.println("Please chose the unit");
            return false;
        }
    }
}
