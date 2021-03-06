package com.rezahdrm.creational.abstractfactory.shape2D;

public class Square extends Rectangle {

    @Override
    public double perimeter() {
        return 4.0 * length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2.0);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
}
