package com.rezahdrm.behavioral.visitor;

public class AddVisitor implements ContentVisitor {
    @Override
    public void visit(Content content) {
        content.setData(content.getData() + 100);
    }
}
