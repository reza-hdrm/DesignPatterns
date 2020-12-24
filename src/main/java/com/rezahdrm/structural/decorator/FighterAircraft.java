package com.rezahdrm.structural.decorator;

public class FighterAircraft extends Aircraft {

    public enum FighterAircraftType {
        AIR_SUPERIORITY_FIGHTER, FIGHTER_BOMBER, HEAVY_FIGHTER, LIGHT_FIGHTER,
        INTERCEPTOR, RECONNAISSANCE_FIGHTER, STRATEGIC_FIGHTER, ALL_WEATHER_FIGHTER
    }

    private FighterAircraftType fighterAircraftType;

    public FighterAircraft(String manufacturer, String model, int topSpeed, FighterAircraftType fighterAircraftType) {
        super(manufacturer, model, topSpeed);
        this.fighterAircraftType = fighterAircraftType;
    }

    public FighterAircraftType getFighterAircraftType() {
        return fighterAircraftType;
    }

    public void setFighterAircraftType(FighterAircraftType fighterAircraftType) {
        this.fighterAircraftType = fighterAircraftType;
    }

    @Override
    public String toString() {
        return String.format(
                "Fighter Aircraft: %s\n" +
                        "Type: %s\n" +
                        "Manufacturer: %s\n" +
                        "Top Speed: %d km/h\n",
                getModel(), fighterAircraftType.toString().toLowerCase(), getManufacturer(), getTopSpeed()
        );
    }
}
