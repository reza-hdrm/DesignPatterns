package com.rezahdrm.behavioral.templatemethod;

public class ElectricalEngineering extends BaseEngineering {
    @Override
    protected void additional() {
        System.out.println("Digital Systems");
        System.out.println("Electronic");
        System.out.println("DSP");
    }
}
