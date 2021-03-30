package com.rezahdrm.behavioral.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class SMSObserver implements Observer {
    private final String[] phoneNumbers;

    public SMSObserver(String... phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(phoneNumbers).forEach(
                phoneNumber -> System.out.printf("SENDING SMS TO : %s . MESSAGE : %S%n", phoneNumber, arg)
        );
    }
}
