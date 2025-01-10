package com.javacode.learn.model;


import com.javacode.learn.model.impl.Circle;
import com.javacode.learn.model.impl.Rectangle;
import com.javacode.learn.model.impl.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    private static final Double sideA = 5.0;
    private static final Double sideB = 3.0;
    private static final Double sideC = 4.0;
    private static Shape circle;
    private static Shape rectangle;
    private static Shape triangle;

    @BeforeEach
    public void setUp() {
        circle = new Circle(sideA);
        rectangle = new Rectangle(sideA, sideB);
        triangle = new Triangle(sideA, sideB, sideC);
    }

    @Test
    public void correctAreaCircle() {
        Double expectedValue = Math.PI * sideA * sideA;
        Double actualValue = circle.getArea();
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void correctPerimeterCircle() {
        Double expectedValue = Math.PI * sideA * 2;
        Double actualValue = circle.getPerimeter();
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void correctAreaRectangle() {
        Double expectedValue = sideA * sideB;
        Double actualValue = rectangle.getArea();
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void correctPerimeterRectangle() {
        Double expectedValue = (sideA + sideB) * 2;
        Double actualValue = rectangle.getPerimeter();
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void correctAreaTriangle() {
        Double s = (sideA + sideB + sideC) / 2;
        Double expectedValue = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        Double actualValue = triangle.getArea();
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void correctPerimeterTriangle() {
        Double expectedValue = sideA + sideB + sideC;
        Double actualValue = triangle.getPerimeter();
        assertEquals(actualValue, expectedValue);
    }
}