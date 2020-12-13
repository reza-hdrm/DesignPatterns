package com.rezahdrm.creational.factorymethod.shape2D;

public interface Shape2D {
    enum Shape2DType {RECTANGLE, SQUARE, CIRCLE, TRIANGLE,}

    default void draw() {
        System.out.println("Drawing " + this.getClass().getSimpleName());
    }

    double perimeter();

    double area();
}
