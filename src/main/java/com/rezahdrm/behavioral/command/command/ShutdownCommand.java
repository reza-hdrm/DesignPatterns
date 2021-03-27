package com.rezahdrm.behavioral.command.command;

import com.rezahdrm.behavioral.command.receiver.ServerAgent;

public class ShutdownCommand extends Command {
    public ShutdownCommand(ServerAgent serverAgent) {
        super(serverAgent);
    }

    @Override
    public void execute() {
        serverAgent.connect();
        serverAgent.shutdown();
        serverAgent.disconnect();
    }
}
