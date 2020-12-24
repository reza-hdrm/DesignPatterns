package com.rezahdrm.structural.decorator;

public class GunDecorator extends AircraftDecorator {
    private String weaponName;
    private float caliber;

    public GunDecorator(Aircraft aircraft, String weaponName, float caliber) {
        super(aircraft);
        this.weaponName = weaponName;
        this.caliber = caliber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return aircraft.toString()+"Gun: "+weaponName+"\t"+"Caliber: "+caliber+"mm\n";
    }
}
