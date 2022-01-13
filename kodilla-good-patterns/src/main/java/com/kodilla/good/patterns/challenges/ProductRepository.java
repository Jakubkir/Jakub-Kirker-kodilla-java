package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.util.Map;

public class ProductRepository {
    Map<String, BigDecimal> productPrices = Map.of(
            "Lego", new BigDecimal(15.49),
            "Auto", new BigDecimal(9.99),
            "Barbie", new BigDecimal(49.99),
            "Samolot", new BigDecimal(24.99),
            "Rowerek", new BigDecimal(99.99)
    );
    public void price (BigDecimal price){
        BigDecimal prices = productPrices.get(productPrices);
    }
        }

