package com.rezahdrm.behavioral.command.receiver;

public interface ServerAgent {
    void connect();
    void reboot();
    void shutdown();
    void disconnect();
}
