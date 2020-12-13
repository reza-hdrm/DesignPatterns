package com.rezahdrm.creational.abstractfactory.shape2D;

import com.rezahdrm.creational.abstractfactory.Shape;

public class Rectangle implements Shape {
    protected double length;
    private double width;

    @Override
    public double perimeter() {
        return 2.0 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public final double getWidth() {
        return width;
    }

    public final void setWidth(double width) {
        this.width = width;
    }
}
