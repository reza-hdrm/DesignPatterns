package com.rezahdrm.creational.abstractfactory.shape3D;

import com.rezahdrm.creational.abstractfactory.Shape;

public class Sphere implements Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public Sphere() {
    }

    @Override
    public double area() {
        // A = 4πr^2
        return 4.0 * Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public double volume() {
        // V = (4/3)πr^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
