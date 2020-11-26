package com.company;

import java.util.List;

public class SquarePyramid extends SpaceShape {
    List<Double> d;
    private double width;
    private double height;

    public SquarePyramid(List<List<Double>> vertices, double width, double height) {
        super(vertices);
        d = vertices.get(3);
        this.width = width;
        this.height = height;
    }

    public double area() {
        double So = width * width;
        double l = Math.sqrt(Math.pow((width / 2), 2) + Math.pow(height, 2));
        double Sb = 4 * width * l / 2;
        double area = So + Sb;
        return area;
    }

    public double volume() {
        double volume = height * width * width / 3;
        return volume;
    }

    public String toString() {
        return "Square Pyramid " +
                "\nVertices: d: " + d +
                "\nArea = " + area() +
                "\nVolume = " + volume();
    }
}
