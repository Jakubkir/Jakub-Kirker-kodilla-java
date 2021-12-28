package com.kodilla.good.patterns.food2Door;

import java.util.Locale;

public class FindProducent {
    static FoodProducent find(String name) throws NoFoodProducentFind {
        switch (name.toLowerCase()) {
            case "extra food shop":
                return new ExtraFoodShop();
            case "healthy shop":
                return new HealthyShop();
            case "gluten free shop":
                return new GlutenFreeShop();
        }
        throw new NoFoodProducentFind();
    }
}
