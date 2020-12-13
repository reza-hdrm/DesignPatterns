package com.rezahdrm.creational.abstractfactory.shape3D;

import com.rezahdrm.creational.abstractfactory.Shape;

public class Cuboid implements Shape {
    protected double length;
    private double width;
    private double height;

    public Cuboid() {
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        // A = 2(xy+yz+zx)
        return 2.0 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        // V = xyz
        return length * width * height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
