package com.rezahdrm.structural.bridge.shape2D;


import com.rezahdrm.structural.bridge.color.Color;

public abstract class Shape2D {

    private final Color color;

    public Shape2D(Color color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing " + this.getClass().getSimpleName());
    }

    public abstract double perimeter();

    public abstract double area();

    public void applyColor(){
        color.applyColor();
    }

    public Color getColor() {
        return color;
    }
}
