package com.rezahdrm.creational.factorymethod.shape2D;

public class Triangle implements Shape2D {
    private double a;
    private double b;
    private double c;
    @Override
    public void draw() {
        System.out.println("Drawing " + Triangle.class.getSimpleName());
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public double area() {
        // Heron's Formula
        double s=perimeter()/2;
        double t=s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(t);
    }


    public void setABC(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
