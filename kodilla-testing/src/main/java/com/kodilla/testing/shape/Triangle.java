package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

public class Triangle {
    String shapeName;
    double field;

    public Triangle(double height, double sideLenghtLe) {
        this.shapeName = "triangle";
        this.field = sideLenghtLe / 2 * height;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
