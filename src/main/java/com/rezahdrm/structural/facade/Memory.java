package com.rezahdrm.structural.facade;

public class Memory {
    private String brand;
    private int capacity;
    private String computerMemoryType;

    public Memory(String brand, int capacity, String computerMemoryType) {
        this.brand = brand;
        this.capacity = capacity;
        this.computerMemoryType = computerMemoryType;
    }

    public void load(long position, byte[] data) {
    }
}
