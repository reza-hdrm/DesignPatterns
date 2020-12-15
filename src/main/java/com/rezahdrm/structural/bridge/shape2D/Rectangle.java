package com.rezahdrm.structural.bridge.shape2D;

import com.rezahdrm.structural.bridge.color.Color;

public class Rectangle extends Shape2D {
    protected double length;
    private double width;

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public double perimeter() {
        // P = 2(x+y)
        return 2.0 * (length + width);
    }

    @Override
    public double area() {
        // A = xy
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
