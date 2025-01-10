package com.javacode.learn.model.impl;

import com.javacode.learn.model.Shape;

public class Triangle implements Shape {
    private final Double sideA;
    private final Double sideB;
    private final Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public Double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public Double getArea() {
        Double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}