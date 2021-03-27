package com.rezahdrm.behavioral.command.command;

import com.rezahdrm.behavioral.command.ServerCommandInvoker;
import com.rezahdrm.behavioral.command.receiver.AsiaServer;
import com.rezahdrm.behavioral.command.receiver.ServerAgent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    void testCommand() {
        assertDoesNotThrow(() -> {
            ServerAgent asiaServer = new AsiaServer();
            Command shutdownCommand = new ShutdownCommand(asiaServer);
            ServerCommandInvoker invoker = new ServerCommandInvoker(shutdownCommand);
            invoker.run();

            new ServerCommandInvoker(new Command(asiaServer) {
                @Override
                public void execute() {
                    asiaServer.connect();
                    asiaServer.disconnect();
                }
            }).run();
        });
    }
}