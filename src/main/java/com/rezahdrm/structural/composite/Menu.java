package com.rezahdrm.structural.composite;

import java.util.LinkedList;
import java.util.List;

// Composite
public class Menu extends MenuComponent {
    private final List<MenuComponent> children;

    public Menu(String name, String url) {
        super(name, url);
        children = new LinkedList<>();
    }

    public Menu add(MenuComponent menuComponent) {
        children.add(menuComponent);
        return this;
    }

    public Menu remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("::Menu::");
        stringBuilder.append(getLink());
        children.forEach(leaf -> stringBuilder.append(leaf.toString()));
        return stringBuilder.toString();
    }
}
