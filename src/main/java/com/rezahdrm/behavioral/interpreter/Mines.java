package com.rezahdrm.behavioral.interpreter;

import java.util.Map;

public class Mines implements Expression {
    private final Expression leftOperand;
    private final Expression rightOperand;

    public Mines(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> contex) {
        return leftOperand.interpret(contex) - rightOperand.interpret(contex);
    }
}
