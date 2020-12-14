package com.rezahdrm.creational.prototype;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void prototypeDesignPatternTest(){
        User user =new User();
        User userClone = user.clone();
        Assert.assertTrue(user.hashCode()!=userClone.hashCode());
    }

}