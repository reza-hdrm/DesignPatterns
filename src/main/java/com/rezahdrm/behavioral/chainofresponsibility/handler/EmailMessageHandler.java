package com.rezahdrm.behavioral.chainofresponsibility.handler;

import com.rezahdrm.behavioral.chainofresponsibility.Message;

import java.util.Objects;

public class EmailMessageHandler extends MessageHandler {
    public EmailMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.EMAIL))
            System.out.printf("message sent to : %s via Email %n", message.getDestinationMap().get(Message.Destination.EMAIL));

        else if (Objects.nonNull(nextHandler))
            nextHandler.handle(message);
    }
}
