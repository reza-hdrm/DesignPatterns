package com.rezahdrm.creational.abstractfactory.factory;

import com.rezahdrm.creational.abstractfactory.Shape;
import com.rezahdrm.creational.abstractfactory.shape3D.*;

public class Shape3DFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CONE -> new Cone();
            case CUBE -> new Cube();
            case CUBOID -> new Cuboid();
            case CYLINDER -> new Cylinder();
            case SPHERE -> new Sphere();
            default -> throw new IllegalArgumentException("Shape3D Type Not Found");
        };
    }
}
