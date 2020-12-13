package com.rezahdrm.creational.abstractfactory.factory;

import com.rezahdrm.creational.abstractfactory.Shape;
import com.rezahdrm.creational.abstractfactory.shape2D.*;

public class Shape2DFactory extends AbstractShapeFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            default:
                throw new IllegalArgumentException("Shape2D Type Not Found");
        }
        return shape;
    }
}
