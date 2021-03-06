package com.rezahdrm.creational.abstractfactory.factory;

import com.rezahdrm.creational.abstractfactory.Shape;

public interface AbstractShapeFactory {
    public enum ShapeType {
        CIRCLE, RECTANGLE, SQUARE, TRIANGLE,
        CYLINDER, CUBE, SPHERE, CONE, CUBOID
    }

    public abstract Shape getShape(ShapeType shapeType);
}
