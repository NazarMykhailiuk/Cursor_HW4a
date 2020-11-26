package com.company;

import java.util.List;

public class Cuboid extends SpaceShape {
    List<Double> d;
    private double width;
    private double height;
    private double depth;

    public Cuboid(List<List<Double>> vertices, double width, double height, double depth) {
        super(vertices);
        d = vertices.get(3);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double area() {
        return (2 * (width * depth) + (width * height) + (depth * height));
    }

    public double volume() {
        return width * height * depth;
    }

    public String toString() {
        return "Cuboid " +
                "\nVertices: d: " + d +
                "\nArea = " + area() +
                "\nVolume = " + volume();
    }
}
