package com.rezahdrm.behavioral.interpreter;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(final String expression) {
        final Stack<Expression> expressionStack = new Stack<>();
        for (String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    final Expression addExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(addExpression);
                    break;
                case "-":
                    final Expression right = expressionStack.pop();
                    final Expression left = expressionStack.pop();
                    final Expression subExpression = new Mines(left, right);
                    expressionStack.push(subExpression);
                    break;
                default:
                    expressionStack.push(new Variable(token));
                    break;
            }
        }
        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> contex) {
        return syntaxTree.interpret(contex);
    }
}
