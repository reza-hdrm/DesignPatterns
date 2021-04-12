package com.rezahdrm.creational.abstractfactory.factory;

import com.rezahdrm.creational.abstractfactory.Shape;
import com.rezahdrm.creational.abstractfactory.shape3D.*;

public class Shape3DFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CONE:
                shape = new Cone();
                break;
            case CUBE:
                shape = new Cube();
                break;
            case CUBOID:
                shape = new Cuboid();
                break;
            case CYLINDER:
                shape = new Cylinder();
                break;
            case SPHERE:
                shape = new Sphere();
                break;
            default:
                throw new IllegalArgumentException("Shape3D Type Not Found");
        }
        return shape;
    }
}
