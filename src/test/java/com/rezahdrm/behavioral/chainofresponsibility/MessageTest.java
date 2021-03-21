package com.rezahdrm.behavioral.chainofresponsibility;

import com.rezahdrm.behavioral.chainofresponsibility.service.MessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @Test
    void messageTest() {
        Assertions.assertDoesNotThrow(() -> {
            Message message = Message.getBuilder().setValue("Hi , new Message , Contact us")
                    .addDestination(Message.Destination.SMS, "09339854142")
                    .addDestination(Message.Destination.EMAIL, "reza-hdrm@github.com")
                    .addDestination(Message.Destination.FAX, "0212224115")
                    .createMessage();
            MessageService messageService = new MessageService();
            messageService.sendMessage(message);
        });
    }

}