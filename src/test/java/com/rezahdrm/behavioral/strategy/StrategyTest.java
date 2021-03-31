package com.rezahdrm.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {
    @Test
    void strategyTest() {
        assertDoesNotThrow(() -> {
            InsuranceCalculate insuranceCalculate=new InsuranceCalculate1399();
            InsuranceCalculate insuranceCalculate1=new InsuranceCalculate1400();
            insuranceCalculate.calculate();
            insuranceCalculate1.calculate();
        });
    }
}