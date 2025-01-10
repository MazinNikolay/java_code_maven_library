package com.javacode.learn.model.impl;

import com.javacode.learn.model.ThreeDShape;

public class Cube implements ThreeDShape {
    private final Double side;

    public Cube(Double radius) {
        this.side = radius;
    }

    @Override
    public Double getVolume() {
        return Math.pow(side, 3);
    }
}