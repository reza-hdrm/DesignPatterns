package com.rezahdrm.behavioral.state;

public class TV {
    private RemoteControl state;

    public TV(RemoteControl state) {
        this.state = state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void togglePower() {
        state.switchState(this);
        System.out.println("--------------------------------");
    }
}
