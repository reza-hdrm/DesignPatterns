package com.rezahdrm.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {
    @Test
    void observerTest() {
        assertDoesNotThrow(() -> {
            MessageSubject messageSubject=new MessageSubject();
            messageSubject.addObserver(new EmailObserver("reza_hdrm@gmail.com","reza-hdrm@github.com"));
            messageSubject.addObserver(new TelegramObserver("@reza_hdrm","@hawjreza"));
            messageSubject.addObserver(new SMSObserver("09339984124"));
            messageSubject.addObserver(new SMSObserver("09366354585"));

            messageSubject.receiveMessage("Hey This is me! Call");
        });
    }
}