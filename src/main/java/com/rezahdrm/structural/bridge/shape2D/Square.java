package com.rezahdrm.structural.bridge.shape2D;

import com.rezahdrm.structural.bridge.color.Color;

public class Square extends Rectangle {

    public Square(Color color) {
        super(color);
    }

    @Override
    public double perimeter() {
        // P = 4x
        return 4.0 * length;
    }

    @Override
    public double area() {
        // A = x^2
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
