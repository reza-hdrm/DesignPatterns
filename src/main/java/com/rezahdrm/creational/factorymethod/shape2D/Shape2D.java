package com.rezahdrm.creational.factorymethod.shape2D;

public interface Shape2D {
    enum TypeShape2D {RECTANGLE, SQUARE, CIRCLE, TRIANGLE,}

    void draw();

    double perimeter();

    double area();
}
