package com.rezahdrm.behavioral.interpreter;

import java.util.Map;

public interface Expression  {
    int interpret(final Map<String, Expression> contex);
}