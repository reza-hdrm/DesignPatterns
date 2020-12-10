package com.rezahdrm.creational.factorymethod;

import com.rezahdrm.creational.factorymethod.shape2D.*;

public class FactoryShape2D {

    public static Shape2D getInstance(Shape2D.TypeShape2D typeShape2D) {
        Shape2D shape2D = null;
        switch (typeShape2D) {
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
