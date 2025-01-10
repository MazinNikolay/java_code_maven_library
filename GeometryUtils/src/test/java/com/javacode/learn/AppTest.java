package com.javacode.learn;

import com.javacode.learn.model.Shape;
import com.javacode.learn.model.impl.Rectangle;
import com.javacode.learn.model.impl.Triangle;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void correctEqualShapesType() {
        Shape shape1 = new Triangle(3.0, 4.0, 4.0);
        Shape shape2 = new Triangle(4.0, 6.0, 7.0);
        assertEquals(App.isEqualShapesType(shape1, shape2), true);
    }

    @Test
    void incorrectEqualShapesType() {
        Shape shape1 = new Triangle(3.0, 4.0, 4.0);
        Shape shape2 = new Rectangle(4.0, 6.0);
        assertEquals(App.isEqualShapesType(shape1, shape2), false);
    }
}