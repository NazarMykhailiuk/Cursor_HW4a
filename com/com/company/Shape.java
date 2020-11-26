package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    List<List<Double>> vertices;

    public Shape(List<List<Double>> vertices) {
        this.vertices = vertices;
    }
}
