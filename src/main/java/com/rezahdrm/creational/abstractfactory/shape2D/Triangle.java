package com.rezahdrm.creational.abstractfactory.shape2D;

import com.rezahdrm.creational.abstractfactory.Shape;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        // Heron's Formula
        double s = perimeter() / 2;
        double t = s * (s - a) * (s - b) * (s - c);
        return Math.sqrt(t);
    }


    public void setABC(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
