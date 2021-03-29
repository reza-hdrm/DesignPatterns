package com.rezahdrm.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InterpreterTest {
    @Test
    void interpreterTest() {
        String expression="w x z - +";
        Evaluator sentence=new Evaluator(expression);
        Map<String ,Expression> variables=new HashMap<>();
        variables.put("w",new Num(5));
        variables.put("x",new Num(11));
        variables.put("z",new Num(40));
        int resul = sentence.interpret(variables);
        System.out.println(resul);
    }
}