package com.rezahdrm.structural.decorator;

public class MissileDecorator extends AircraftDecorator {
    private String modelName;
    private int operationalRang;

    public MissileDecorator(Aircraft aircraft, String modelName, int operationalRang) {
        super(aircraft);
        this.modelName = modelName;
        this.operationalRang = operationalRang;
    }



    @Override
    public String toString() {
        return aircraft.toString() + "Missile: " + modelName + "\t" + "Operational Range: " + operationalRang+"\n";
    }
}
