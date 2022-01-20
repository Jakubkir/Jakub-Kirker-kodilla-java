package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop implements FoodProducent {

    @Override
    public boolean process(String foodProducent, String product, int quantity, String unit) {
        if (quantity > 0) {
            System.out.println("The " + foodProducent + " can delivery product.");
            return true;
        } else {
            System.out.println("Please order more than zero");
            return false;
        }
    }
}
