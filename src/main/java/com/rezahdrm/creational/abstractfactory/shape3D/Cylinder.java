package com.rezahdrm.creational.abstractfactory.shape3D;

import com.rezahdrm.creational.abstractfactory.Shape;

public class Cylinder implements Shape {
    protected double radius;
    protected double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        // A =  2πr(h+r)
        return 2 * Math.PI * radius * (height + radius);
    }

    @Override
    public double volume() {
        // V = πr^2h
        return Math.PI * Math.pow(radius, 2.0) * height;
    }
}
