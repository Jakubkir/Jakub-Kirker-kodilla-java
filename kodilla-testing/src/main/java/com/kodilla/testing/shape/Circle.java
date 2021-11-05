package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

public class Circle {

    String shapeName;
    double field;

    public Circle(double radius) {
        this.shapeName = "circle";
        this.field = Math.PI * radius * radius;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public Double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
