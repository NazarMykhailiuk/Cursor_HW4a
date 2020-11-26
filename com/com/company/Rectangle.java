package com.company;
import java.util.List;
public class Rectangle extends PlaneShape {
    List<Double> a;
    private float width;
    private float height;

    Rectangle(List<List<Double>> vertices, float width, float height) {
        super(vertices);
        a = vertices.get(0);
        this.width = width;
        this.height = height;
    }

    public double perimeter() {

        return width * 2 + height * 2;
    }

    public double area() {

        return width * height;

    }

    public String toString() {
        return "Rectangle " +
                "\nVertices: a: " + a +
                "\nPerimeter = " + perimeter() +
                "\nArea = " + area();
    }
}
