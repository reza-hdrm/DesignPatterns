package com.rezahdrm.structural.facade;

public class CPU {
    private String brand;
    private String series;
    private String cpuSocket;
    private String cpuSpeed;

    public CPU(String brand, String series, String cpuSocket, String cpuSpeed) {
        this.brand = brand;
        this.series = series;
        this.cpuSocket = cpuSocket;
        this.cpuSpeed = cpuSpeed;
    }

    public void freeze() {
    }

    public void jump(long position) {
    }

    public void execute() {
    }
}
