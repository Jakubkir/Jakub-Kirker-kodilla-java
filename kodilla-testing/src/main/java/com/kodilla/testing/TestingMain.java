package com.kodilla.testing;

import com.kodilla.testing.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(7, 5);
        int sub = calculator.substract(8, 6);
        if (sum == 12 && sub == 2) {
            System.out.println("Calculator is ok");
        } else {
            System.out.println("Error");
        }
    }
}
