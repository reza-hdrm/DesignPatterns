package com.rezahdrm.behavioral.interpreter;

import java.util.Map;

public class Num implements Expression {
    private int value;

    public Num(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Map<String, Expression> contex) {
        return value;
    }
}
