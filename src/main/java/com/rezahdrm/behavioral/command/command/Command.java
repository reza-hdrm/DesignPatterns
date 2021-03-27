package com.rezahdrm.behavioral.command.command;

import com.rezahdrm.behavioral.command.receiver.ServerAgent;

public abstract class Command {
    protected final ServerAgent serverAgent;

    public Command(ServerAgent serverAgent) {
        this.serverAgent = serverAgent;
    }

    public abstract void execute();
}
