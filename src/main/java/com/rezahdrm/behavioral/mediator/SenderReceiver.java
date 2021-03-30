package com.rezahdrm.behavioral.mediator;

import java.util.Date;

public abstract class SenderReceiver {
    protected MessageDelivery messageDelivery;
    private String name;

    public SenderReceiver(MessageDelivery messageDelivery, String name) {
        this.messageDelivery = messageDelivery;
        this.name = name;
        messageDelivery.registerClient(this);
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(SenderReceiver sender, String message) {
        System.out.println("-------------------------------");
        System.out.println(getName());
        System.out.printf("<%s><%s> : %s%n", sender.getName(), new Date(), message);
    }

    public abstract void sendMessage(String userName, String message);
}
