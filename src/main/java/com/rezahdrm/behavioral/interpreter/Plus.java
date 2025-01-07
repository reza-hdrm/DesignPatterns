package com.rezahdrm.behavioral.interpreter;

import java.util.Map;

public class Plus implements Expression {
    private final Expression leftOperand;
    private final Expression rightOperand;

    public Plus(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> contex) {
        return leftOperand.interpret(contex) + rightOperand.interpret(contex);
    }
}
