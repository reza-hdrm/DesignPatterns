package com.rezahdrm.creational.abstractfactory.factory;


public interface ShapeFactory {
    enum ShapeFactoryType {
        SHAPE2D, SHAPE3D;
    }

    static AbstractShapeFactory getShapeFactory(ShapeFactoryType shapeFactoryType) {
        return switch (shapeFactoryType) {
            case SHAPE2D -> new Shape2DFactory();
            case SHAPE3D -> new Shape3DFactory();
            default -> throw new IllegalArgumentException("Shape Factory Type Not Found");
        };
    }
}
