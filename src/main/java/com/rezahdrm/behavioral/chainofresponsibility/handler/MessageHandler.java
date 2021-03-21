package com.rezahdrm.behavioral.chainofresponsibility.handler;

import com.rezahdrm.behavioral.chainofresponsibility.Message;

public abstract class MessageHandler {
    protected final MessageHandler nextHandler;

    protected MessageHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Message message);
}
