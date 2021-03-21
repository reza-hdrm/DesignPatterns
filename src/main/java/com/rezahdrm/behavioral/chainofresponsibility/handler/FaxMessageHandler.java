package com.rezahdrm.behavioral.chainofresponsibility.handler;

import com.rezahdrm.behavioral.chainofresponsibility.Message;

import java.util.Objects;

public class FaxMessageHandler extends MessageHandler {
    public FaxMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.FAX))
            System.out.printf("message sent to : %s via Fax %n", message.getDestinationMap().get(Message.Destination.FAX));

        else if (Objects.nonNull(nextHandler))
            nextHandler.handle(message);
    }
}
