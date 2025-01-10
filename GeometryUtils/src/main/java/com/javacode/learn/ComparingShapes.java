package com.javacode.learn;

import com.javacode.learn.model.Shape;

public class ComparingShapes {
    public static boolean isEqualShapesType(Shape shape1, Shape shape2) {
        return shape1.getShapeName().equals(shape2.getShapeName());
    }

    public static void getShapeInfo(Shape shape) {
        System.out.println("shape.getArea() = " + shape.getArea());
        System.out.println("shape.getPerimeter = " + shape.getPerimeter());
        System.out.println("shape.getShapeName() = " + shape.getShapeName());
    }
}
