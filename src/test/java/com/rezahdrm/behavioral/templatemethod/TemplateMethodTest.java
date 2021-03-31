package com.rezahdrm.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {
    @Test
    void templateMethodTest() {
        assertDoesNotThrow(() -> {
            BaseEngineering engineering = new SoftwareEngineering();
            BaseEngineering engineering1 = new ElectricalEngineering();
            engineering.study();
            System.out.println("----------------------------");
            engineering1.study();
        });
    }
}