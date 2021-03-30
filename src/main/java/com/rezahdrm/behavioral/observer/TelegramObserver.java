package com.rezahdrm.behavioral.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class TelegramObserver implements Observer {
    private final String[] userNames;

    public TelegramObserver(String... userNames) {
        this.userNames = userNames;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(userNames).forEach(
                userName -> System.out.printf("SENDING TO (VIA TELEGRAM) : %s . MESSAGE : %S%n", userName, arg)
        );
    }
}
