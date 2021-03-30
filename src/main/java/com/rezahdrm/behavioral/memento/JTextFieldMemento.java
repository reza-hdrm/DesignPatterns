package com.rezahdrm.behavioral.memento;

public class JTextFieldMemento {
    private String text;

    public JTextFieldMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
