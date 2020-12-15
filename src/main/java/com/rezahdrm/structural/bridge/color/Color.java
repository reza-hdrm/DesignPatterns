package com.rezahdrm.structural.bridge.color;

public interface Color {
    default void applyColor() {
        System.out.println("Apply " + this.getClass().getSimpleName());
    }
}
