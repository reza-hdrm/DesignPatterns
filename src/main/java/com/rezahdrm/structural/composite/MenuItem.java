package com.rezahdrm.structural.composite;

// Leaf
public class MenuItem extends MenuComponent {
    public MenuItem(String name, String url) {
        super(name, url);
    }

    @Override
    public String toString() {
        return "\t:item:"+getLink();
    }
}
