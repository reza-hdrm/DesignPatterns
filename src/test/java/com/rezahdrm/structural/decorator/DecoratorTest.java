package com.rezahdrm.structural.decorator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void decoratorTest() {
        Assertions.assertDoesNotThrow(() -> {
            Aircraft f14 = new FighterAircraft(
                    "Grumman", "F-14", 2485, FighterAircraft.FighterAircraftType.HEAVY_FIGHTER);
            MissileDecorator phoenix = new MissileDecorator(f14, "AIM-54 Phoenix", 190);
            System.out.println(phoenix);

            Aircraft f16 = new GunDecorator(
                    new MissileDecorator(
                            new FighterAircraft(
                                    "Lockheed Martin",
                                    "F-16",
                                    2175,
                                    FighterAircraft.FighterAircraftType.LIGHT_FIGHTER),
                            "GR-20A", 20
                    ),
                    "M61A1 Vulcan", 30
            );
            System.out.println(f16);
        });
    }

}