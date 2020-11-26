package com.company;

import java.util.List;

public class Sphere extends SpaceShape {
    List<Double> d;
    private double radius;

    public Sphere(List<List<Double>> vertices, double radius) {
        super(vertices);
        d = vertices.get(3);
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.pow(radius, 3) * Math.PI * 4 / 3;
    }

    public String toString() {
        return "Sphere " +
                "\nVertices: d: " + d +
                "\nArea = " + area() +
                "\nVolume = " + volume();
    }
}
