package com.rezahdrm.behavioral.command.command;

import com.rezahdrm.behavioral.command.receiver.ServerAgent;

public class RebootCommand extends Command {
    public RebootCommand(ServerAgent serverAgent) {
        super(serverAgent);
    }

    @Override
    public void execute() {
        serverAgent.connect();
        serverAgent.reboot();
        serverAgent.disconnect();
    }
}
