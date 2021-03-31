package com.rezahdrm.behavioral.state;

public class Off implements RemoteControl {
    public static final Off INSTANCE = new Off();

    private Off() {

    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now OFF ...");
        tv.setState(On.INSTANCE);
        System.out.println("TV is powering on ...");
    }
}
