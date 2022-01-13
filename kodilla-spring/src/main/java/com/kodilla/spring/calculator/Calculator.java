package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double subBfromA(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        double val = a * b;
        display.displayValue(val);
        return val;
    }

    public double divAbyB(double a, double b) {
        double val;
        if (b != 0) {
            val = a / b;
            return val;
        } else {
            val = -1;
            System.out.println("You can't divide by 0!");
        }
        return val;
    }
}
