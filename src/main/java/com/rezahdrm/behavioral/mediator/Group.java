package com.rezahdrm.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Group extends SenderReceiver {
    private final List<Client> clientList = new ArrayList<>();

    public Group(MessageDelivery messageDelivery, String name) {
        super(messageDelivery, name);
    }

    @Override
    public void sendMessage(String userName, String message) {
        clientList.forEach(client -> messageDelivery.broadcast(this, client.getName(), message));
    }

    public Group addGroup(Client client) {
        clientList.add(client);
        return this;
    }
}
