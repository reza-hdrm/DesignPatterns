package com.rezahdrm.structural.decorator;

public abstract class AircraftDecorator extends Aircraft {
    protected Aircraft aircraft;

    public AircraftDecorator(Aircraft aircraft) {
        super(aircraft.getManufacturer(), aircraft.getModel(), aircraft.getTopSpeed());
        this.aircraft = aircraft;
    }

}
