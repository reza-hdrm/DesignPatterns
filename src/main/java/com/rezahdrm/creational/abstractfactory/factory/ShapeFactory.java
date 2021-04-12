package com.rezahdrm.creational.abstractfactory.factory;


public interface ShapeFactory {
    enum ShapeFactoryType {
        SHAPE2D, SHAPE3D;
    }

    static AbstractShapeFactory getShapeFactory(ShapeFactoryType shapeFactoryType) {
        AbstractShapeFactory abstractShapeFactory = null;
        switch (shapeFactoryType) {
            case SHAPE2D:
                abstractShapeFactory = new Shape2DFactory();
                break;
            case SHAPE3D:
                abstractShapeFactory = new Shape3DFactory();
                break;
            default:
                throw new IllegalArgumentException("Shape Factory Type Not Found");
        }
        return abstractShapeFactory;
    }
}
