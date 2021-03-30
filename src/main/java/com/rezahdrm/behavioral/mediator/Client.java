package com.rezahdrm.behavioral.mediator;

public class Client extends SenderReceiver {
    public Client(MessageDelivery messageDelivery, String name) {
        super(messageDelivery, name);
    }

    @Override
    public void sendMessage(String userName, String message) {
        messageDelivery.broadcast(this, userName, message);
    }
}
