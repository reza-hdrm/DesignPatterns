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
            switch (destination) {
                case FAX:
                    nextHandler = new FaxMessageHandler(nextHandler);
                    break;
                case SMS:
                    nextHandler = new SMSMessageHandler(nextHandler);
                    break;
                case EMAIL:
                    nextHandler = new EmailMessageHandler(nextHandler);
                    break;
            }
            if (Objects.nonNull(nextHandler))
                nextHandler.handle(message);
        }
    }
}
