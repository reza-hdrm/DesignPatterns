package com.rezahdrm.behavioral.command.receiver;

public class USAServer implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("USA SERVER Connect");
    }

    @Override
    public void reboot() {
        System.out.println("USA SERVER Connect");
    }

    @Override
    public void shutdown() {
        System.out.println("USA SERVER Connect");
    }

    @Override
    public void disconnect() {
        System.out.println("USA SERVER Connect");
    }
}
