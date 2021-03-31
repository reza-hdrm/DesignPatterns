package com.rezahdrm.behavioral.visitor;

@FunctionalInterface
public interface ContentVisitor {
    void visit(Content content);
}
