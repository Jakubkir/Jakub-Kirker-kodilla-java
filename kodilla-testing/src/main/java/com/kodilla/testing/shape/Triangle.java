package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 && Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}
