package com.rezahdrm.behavioral.templatemethod;

public abstract class BaseEngineering {
    public void study() {
        physics();
        math();
        advancedMath();
        additional();
    }

    protected abstract void additional();

    private void advancedMath() {
        System.out.println("Advanced Math");
    }

    private void math() {
        System.out.println("Math");
    }

    private void physics() {
        System.out.println("Physics");
    }

}
