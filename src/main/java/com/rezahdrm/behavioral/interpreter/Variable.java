package com.rezahdrm.behavioral.interpreter;

import java.util.Map;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> contex) {
        if (contex.get(name) == null) return 0;
        return contex.get(name).interpret(contex);
    }
}
