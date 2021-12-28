package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop implements FoodProducent {
    @Override
    public boolean process(String foodProducent, String product, int quantity, String unit) {
        if ((quantity > 100) && (unit == "kg")) {
            System.out.println("The " + foodProducent + " can delivery product.");
            return true;
        }else {
            System.out.println("Order less");
            return false;
        }
    }
}
