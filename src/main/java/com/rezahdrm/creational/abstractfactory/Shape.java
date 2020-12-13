package com.rezahdrm.creational.abstractfactory;

public interface Shape {

    default void draw() {
        System.out.println("Drawing " + this.getClass().getSimpleName());
    }

    default double perimeter() {
        throw new IllegalStateException("This Shape Infinite Perimeter");
    }

    double area();

    default double volume() {
        return 0;
    }
}
