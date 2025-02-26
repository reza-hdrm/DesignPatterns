package com.rezahdrm.behavioral.memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel {
    private final JTextFieldHistory jTextFieldHistory;

    public MainPanel() {
        JLabel jLabel = new JLabel("Enter Your Name (Press ctrl+z to undo)");
        JTextField jTextField = new JTextField(20);
        jTextFieldHistory = new JTextFieldHistory(jTextField);
        JButton jButton = new JButton("Save!");
        setLayout(new FlowLayout());

        add(jLabel);
        add(jTextField);
        add(jButton);

        jButton.addActionListener(event -> jTextFieldHistory.save());
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Z) && ((e.getModifiersEx() & KeyEvent.CTRL_MASK) != 0))
                    jTextFieldHistory.undo();
            }
        });
    }


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Memento Design Pattern");
        jFrame.setSize(800, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(new MainPanel());

        jFrame.setVisible(true);
    }
}