package com.javacode.learn.model.impl;

import com.javacode.learn.model.Shape;

public class Circle implements Shape {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}