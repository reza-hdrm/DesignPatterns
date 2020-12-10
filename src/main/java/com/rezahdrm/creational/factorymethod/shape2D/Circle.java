package com.rezahdrm.creational.factorymethod.shape2D;

public class Circle implements Shape2D {
    private double radius;

    @Override
    public void draw() {
        System.out.println("Drawing " + Circle.class.getSimpleName());
    }

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
