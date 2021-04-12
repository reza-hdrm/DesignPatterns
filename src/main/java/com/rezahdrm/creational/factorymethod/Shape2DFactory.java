package com.rezahdrm.creational.factorymethod;

import com.rezahdrm.creational.factorymethod.shape2D.*;

public class Shape2DFactory {
    private Shape2DFactory() {
    }

    public static Shape2D getInstance(Shape2D.Shape2DType shape2DType) {
        Shape2D shape2D = null;
        switch (shape2DType) {
            case CIRCLE:
                shape2D = new Circle();
                break;
            case RECTANGLE:
                shape2D = new Rectangle();
                break;
            case SQUARE:
                shape2D = new Square();
                break;
            case TRIANGLE:
                shape2D = new Triangle();
                break;
        }
        return shape2D;
    }
}
