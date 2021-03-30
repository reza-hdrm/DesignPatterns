package com.rezahdrm.behavioral.mediator;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {
    @Test
    void mediatorTest() {
        assertDoesNotThrow(() -> {
            MessageDelivery messageDelivery = new MessageDelivery();
            Client rezaHeydariMehr = new Client(messageDelivery, "@reza-hdrm");
            Client hosseinZare = new Client(messageDelivery, "@h.zare");

            rezaHeydariMehr.sendMessage("@h.zare", "Salam");

            Group javaProgrammers = new Group(messageDelivery, "@javaProgrammers");
            javaProgrammers.addGroup(rezaHeydariMehr).addGroup(hosseinZare);
            javaProgrammers.sendMessage("@javaProgrammers","Salam be hamegi");
        });
    }
}