package com.rezahdrm.behavioral.chainofresponsibility.service;

import com.rezahdrm.behavioral.chainofresponsibility.Message;
import com.rezahdrm.behavioral.chainofresponsibility.handler.EmailMessageHandler;
import com.rezahdrm.behavioral.chainofresponsibility.handler.FaxMessageHandler;
import com.rezahdrm.behavioral.chainofresponsibility.handler.MessageHandler;
import com.rezahdrm.behavioral.chainofresponsibility.handler.SMSMessageHandler;

import java.util.Objects;

public class MessageService {
    public void sendMessage(Message message) {
        MessageHandler nextHandler = null;
        for (Message.Destination destination : message.getDestinationMap().keySet()) {
            nextHandler = switch (destination) {
                case FAX -> new FaxMessageHandler(nextHandler);
                case SMS -> new SMSMessageHandler(nextHandler);
                case EMAIL -> new EmailMessageHandler(nextHandler);
            };
            if (Objects.nonNull(nextHandler))
                nextHandler.handle(message);
        }
    }
}
