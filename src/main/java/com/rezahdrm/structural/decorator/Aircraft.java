package com.rezahdrm.structural.decorator;

public abstract class Aircraft {
    private String manufacturer;
    private String model;
    private int topSpeed;

    public Aircraft(String manufacturer, String model, int topSpeed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public abstract String toString();
}
