package com.rezahdrm.structural.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuComponentTest {

    @Test
    public void compositeTest() {
        Menu root = new Menu("Transfer Money", "/transfer");
        root.add(new MenuItem("Card To Card", "/cart-to-card")).add(new MenuItem("By Account number", "/account"));
        Menu subMenu = new Menu("Iban", "/by-iban");
        subMenu.add(new MenuItem("Paya", "/paya")).add(new MenuItem("Satna", "/satna"));
        root.add(subMenu);
        System.out.println(root.toString());

    }

}