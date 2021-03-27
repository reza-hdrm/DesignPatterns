package com.rezahdrm.behavioral.command.receiver;

public class EuropeServer implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("EUROPE SERVER Connect");
    }

    @Override
    public void reboot() {
        System.out.println("EUROPE SERVER Reboot");
    }

    @Override
    public void shutdown() {
        System.out.println("EUROPE SERVER Shutdown");
    }

    @Override
    public void disconnect() {
        System.out.println("EUROPE SERVER Disconnect");
    }
}
