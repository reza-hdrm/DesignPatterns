package com.rezahdrm.behavioral.chainofresponsibility.handler;

import com.rezahdrm.behavioral.chainofresponsibility.Message;

import java.util.Objects;

public class SMSMessageHandler extends MessageHandler {
    public SMSMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.SMS))
            System.out.printf("message sent to : %s via SMS %n", message.getDestinationMap().get(Message.Destination.SMS));

        else if (Objects.nonNull(nextHandler))
            nextHandler.handle(message);
    }
}
