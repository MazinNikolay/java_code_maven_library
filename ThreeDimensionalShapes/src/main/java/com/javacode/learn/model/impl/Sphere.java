package com.javacode.learn.model.impl;

import com.javacode.learn.model.ThreeDShape;

public class Sphere implements ThreeDShape {
    private final Double radius;

    public Sphere(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}