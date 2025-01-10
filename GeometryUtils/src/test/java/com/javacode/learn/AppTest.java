package com.javacode.learn;

import org.junit.jupiter.api.Test;
import com.javacode.learn.model.impl.Triangle;
import com.javacode.learn.model.Shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void isEqualShapesType() {
        Shape shape1 = new Triangle(3.0, 4.0, 4.0);
        Shape shape2 = new Triangle(4.0, 6.0, 7.0);
        assertEquals(App.isEqualShapesType(shape1, shape2), true);
    }
}