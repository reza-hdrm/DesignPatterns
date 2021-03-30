package com.rezahdrm.behavioral.memento;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Objects;


public class JTextFieldHistory {

    private final LinkedList<JTextFieldMemento> fieldMementos = new LinkedList<>();
    private final JTextField jTextField;

    public JTextFieldHistory(JTextField jTextField) {
        Objects.requireNonNull(jTextField);
        this.jTextField = jTextField;
    }

    public void save() {
        fieldMementos.push(new JTextFieldMemento(jTextField.getText()));
        jTextField.setText("");
    }

    public void undo() {
        if (!fieldMementos.isEmpty()) {
            JTextFieldMemento pop = fieldMementos.pop();
            jTextField.setText(pop.getText());
        } else {
            jTextField.setText("");
        }
    }
}