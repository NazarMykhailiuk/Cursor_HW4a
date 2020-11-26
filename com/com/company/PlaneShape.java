package com.company;

import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable{
    public PlaneShape(List<List<Double>> vertices) {
        super(vertices);
    }
    public double getDistance(List<Double> a, List<Double> b) {
        return sqrt(pow((a.get(0) - a.get(1)), 2) + pow((b.get(0) - b.get(1)), 2));
    }
}
