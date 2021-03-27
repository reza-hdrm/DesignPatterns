package com.rezahdrm.behavioral.command.receiver;

public class AsiaServer implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("ASIA SERVER Connect");
    }

    @Override
    public void reboot() {
        System.out.println("ASIA SERVER Reboot");
    }

    @Override
    public void shutdown() {
        System.out.println("ASIA SERVER Shutdown");
    }

    @Override
    public void disconnect() {
        System.out.println("ASIA SERVER Disconnect");
    }
}
