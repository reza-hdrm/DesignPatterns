package com.rezahdrm.creational.factorymethod.shape2D;

public class Rectangle implements Shape2D {
    protected double length;
    private double width;
    @Override
    public void draw() {
        System.out.println("Drawing " + Rectangle.class.getSimpleName());
    }

    @Override
    public double perimeter() {
        return 2.0*(length+width);
    }

    @Override
    public double area() {
        return length*width;
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
