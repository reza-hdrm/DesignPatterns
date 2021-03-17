package com.rezahdrm.structural.facade;

public class HardDrive {
    private String brand;
    private String series;
    private int capacity;

    public HardDrive(String brand, String series, int capacity) {
        this.brand = brand;
        this.series = series;
        this.capacity = capacity;
    }

    public byte[] read(long lba, int size) {
        return new byte[10];
    }
}
