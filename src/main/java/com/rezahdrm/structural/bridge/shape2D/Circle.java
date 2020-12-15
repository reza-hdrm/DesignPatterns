package com.rezahdrm.structural.bridge.shape2D;

import com.rezahdrm.structural.bridge.color.Color;

public class Circle extends Shape2D {
    private double radius;

    public Circle(Color color) {
        super(color);
    }

    @Override
    public double perimeter() {
        // P = 2πr
        return 2.0 * radius * Math.PI;
    }

    @Override
    public double area() {
        // A = πr^2
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
