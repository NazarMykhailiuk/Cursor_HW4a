package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> a = new ArrayList<>(),
                b = new ArrayList<>(),
                c = new ArrayList<>(),
                d = new ArrayList<>();
        a.add(4.6);
        a.add(5.57);
        b.add(4.5);
        b.add(9.0);
        c.add(1.5);
        c.add(3.5);
        d.add(2.3);
        d.add(5.3);
        d.add(7.1);

        List<List<Double>> vertices = new ArrayList<>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);

        Rectangle rect = new Rectangle(vertices, 2, 4);
        Triangle triangle = new Triangle(vertices);
        Circle circle = new Circle(vertices, 5);
        SquarePyramid pyramid = new SquarePyramid(vertices, 4, 8);
        Cuboid cub = new Cuboid(vertices, 4, 5, 6);
        Sphere sphere = new Sphere(vertices, 4);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rect);
        shapes.add(cub);
        shapes.add(sphere);
        shapes.add(pyramid);

        for (var i : shapes) {
            System.out.println("\n" + i.toString());
        }
    }
}