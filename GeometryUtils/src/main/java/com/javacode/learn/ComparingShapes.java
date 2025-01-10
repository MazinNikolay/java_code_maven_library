package com.javacode.learn;

import com.javacode.learn.model.Shape;

public class ComparingShapes {
    public static boolean isEqualShapesType(Shape shape1, Shape shape2) {
        return shape1.getShapeName().equals(shape2.getShapeName());
    }
}
