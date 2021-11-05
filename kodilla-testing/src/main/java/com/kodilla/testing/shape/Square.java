package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

public class Square {

    String shapeName;
    double field;

    public Square(double sideLenght) {
        this.shapeName = "square";
        this.field = sideLenght * sideLenght;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
