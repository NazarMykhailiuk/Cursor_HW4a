package com.company;

import java.util.List;

public class Circle extends PlaneShape {
    List<Double> a;
    private double radius;


    public Circle(List<List<Double>> vertices, double radius) {
        super(vertices);
        a = vertices.get(0);
        this.radius = radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle " +
                "\nVertices: a: " + a +
                "\nPerimeter = " + perimeter() +
                "\nArea = " + area();
    }
}
