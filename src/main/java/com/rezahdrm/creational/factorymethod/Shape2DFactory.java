package com.rezahdrm.creational.factorymethod;

import com.rezahdrm.creational.factorymethod.shape2D.*;

public class Shape2DFactory {
    private Shape2DFactory() {
    }

    public static Shape2D getInstance(Shape2D.Shape2DType shape2DType) {
        return switch (shape2DType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            case TRIANGLE -> new Triangle();
        };
    }
}
