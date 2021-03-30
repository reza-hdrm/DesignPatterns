package com.rezahdrm.behavioral.observer;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class EmailObserver implements Observer {
    private final String[] emailAddresses;

    public EmailObserver(String... emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public void update(Observable o, Object arg) {
        Arrays.stream(emailAddresses).forEach(
                emailAddress -> System.out.printf("SENDING EMAIL TO : %s . MESSAGE : %S%n", emailAddress, arg)
        );
    }
}
