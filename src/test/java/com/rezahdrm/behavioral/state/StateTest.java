package com.rezahdrm.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {
    @Test
    void stateTest() {
        assertDoesNotThrow(() -> {
           TV tv=new TV(Off.INSTANCE);
           tv.togglePower();
           tv.togglePower();
        });
    }

}