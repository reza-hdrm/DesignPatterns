package com.rezahdrm.structural.proxy;

public class PersonDAOImpl implements PersonDAO {
    @Override
    public void insert() {
        System.out.println("Person is persistence");
    }
}
