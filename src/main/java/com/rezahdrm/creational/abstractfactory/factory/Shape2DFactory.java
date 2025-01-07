package com.rezahdrm.creational.abstractfactory.factory;

import com.rezahdrm.creational.abstractfactory.Shape;
import com.rezahdrm.creational.abstractfactory.shape2D.*;

public class Shape2DFactory implements AbstractShapeFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case TRIANGLE -> new Triangle();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalArgumentException("Shape2D Type Not Found");
        };
    }
}
