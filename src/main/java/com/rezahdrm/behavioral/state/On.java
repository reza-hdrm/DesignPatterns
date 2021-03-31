package com.rezahdrm.behavioral.state;

public class On implements RemoteControl {
    public static final On INSTANCE = new On();

    private On() {

    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now ON ...");
        tv.setState(Off.INSTANCE);
        System.out.println("TV is powering off ...");
    }
}
