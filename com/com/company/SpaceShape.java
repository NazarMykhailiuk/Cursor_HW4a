package com.company;

import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {

    public SpaceShape(List<List<Double>> vertices) {
        super(vertices);
    }
}
