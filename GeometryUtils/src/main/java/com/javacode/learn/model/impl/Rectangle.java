package com.javacode.learn.model.impl;

import com.javacode.learn.model.Shape;

public class Rectangle implements Shape {
    private final Double sideA;
    private final Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public Double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}
