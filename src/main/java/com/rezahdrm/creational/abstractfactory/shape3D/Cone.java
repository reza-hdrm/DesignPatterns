package com.rezahdrm.creational.abstractfactory.shape3D;

public class Cone extends Cylinder {

    public Cone() {
        super();
    }

    public Cone(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double area() {
        // A = πr(r+sqrt(h^2+r^2)
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2.0) + Math.pow(radius, 2.0)));
    }

    @Override
    public double volume() {
        // V = πhr^2/3
        return super.volume() * (2.0 / 3.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
