package com.rezahdrm.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class MessageDelivery {
    private final Map<String, SenderReceiver> receiverMap = new HashMap<>();

    public void registerClient(SenderReceiver senderReceiver) {
        receiverMap.put(senderReceiver.getName(), senderReceiver);
    }

    public void broadcast(SenderReceiver sender, String clientName, String message) {
        if (receiverMap.containsKey(clientName)) {
            SenderReceiver receiver = receiverMap.get(clientName);
            receiver.receiveMessage(sender, message);
        }
    }
}
