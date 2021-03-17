package com.rezahdrm.creational.prototype;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void prototypeDesignPatternTest() {
        User user = new User();
        User userClone = user.clone();
        Assertions.assertTrue(user.hashCode() != userClone.hashCode());
    }

}