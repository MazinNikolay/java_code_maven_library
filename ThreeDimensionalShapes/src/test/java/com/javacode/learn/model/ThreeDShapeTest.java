package com.javacode.learn.model;

import com.javacode.learn.model.impl.Cube;
import com.javacode.learn.model.impl.Sphere;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeDShapeTest {
    private static final Double side = 5.0;
    private static final Double radius = 4.0;
    private static Cube cube;
    private static Sphere sphere;

    @BeforeEach
    public void setUp() {
        cube = new Cube(side);
        sphere = new Sphere(radius);
    }

    @Test
    void getCubeVolume() {
        Double expectedValue = Math.pow(side, 3);
        Double actualValue = cube.getVolume();
        assertEquals(actualValue, expectedValue);
    }

    @Test
    void getSphereVolume() {
        Double expectedValue = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        Double actualValue = sphere.getVolume();
        assertEquals(actualValue, expectedValue);
    }
}