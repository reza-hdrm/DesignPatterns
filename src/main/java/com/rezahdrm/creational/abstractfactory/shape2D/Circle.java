package com.rezahdrm.creational.abstractfactory.shape2D;

import com.rezahdrm.creational.abstractfactory.Shape;

public class Circle implements Shape {
    private double radius;

    @Override
    public double perimeter() {
        return 2.0 * radius * Math.PI;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
