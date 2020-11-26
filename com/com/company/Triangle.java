package com.company;
import java.util.List;

public class Triangle extends PlaneShape {
    List<Double> a, b, c;


    public Triangle(List<List<Double>> vertices) {
        super(vertices);
        a = vertices.get(0);
        b = vertices.get(1);
        c = vertices.get(2);
    }


    public double area() {
            double p = perimeter() / 2;
            return Math.sqrt(p * (p - getDistance(a, b)) * (p - getDistance(a, c)) * (p - getDistance(b, c)));
    }

    public double perimeter() {
        return (getDistance(a, b) + getDistance(a, c) + getDistance(b, c));

    }

    public String toString() {
        double P = perimeter();
        double S = area();
        return ("Triangle" +
                "\nVertices: a: " + a + "; " + "b: " + b + "; "+ "c: " + c +
                "\nPerimeter = " + P +
                "\nArea = " + S);
    }
}

