package com.rezahdrm.creational.abstractfactory.shape3D;

public class Cube extends Cuboid {
    private double length;

    public Cube() {
    }

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        // A = 6l^2
        return 6 * Math.pow(length, 2.0);
    }

    @Override
    public double volume() {
        // V = l^3
        return Math.pow(length, 3.0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
