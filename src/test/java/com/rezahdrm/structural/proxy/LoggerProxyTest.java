package com.rezahdrm.structural.proxy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerProxyTest {
    private static PersonDAO personDAO;

    @BeforeAll
    static void beforeAll() {
        personDAO = new PersonDAOImpl();
    }

    @Test
    void testLoggerProxy() {
        assertDoesNotThrow(() -> {
            PersonDAO personDAOProxy = LoggerProxy.createLoggerProxy(personDAO);
            personDAOProxy.insert();
        });
    }
}