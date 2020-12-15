package com.rezahdrm.structural.bridge.shape2D;

import com.rezahdrm.structural.bridge.color.Color;

public class Triangle extends Shape2D {
    private double a;
    private double b;
    private double c;

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        /*  Heron's Formula
            s = (a+b+c)/3
            A = [s(s-a)(s-b)(s-c)]^0.5
         */
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
