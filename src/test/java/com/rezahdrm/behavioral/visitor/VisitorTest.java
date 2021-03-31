package com.rezahdrm.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {
    @Test
    void visitorTest() {
        Content content = new Content(50);
        assertNotEquals(150, content.getData());
        content.accept(new AddVisitor());
        assertEquals(150, content.getData());
        content.accept(content1 -> content1.setData(400));
        assertEquals(400, content.getData());
    }
}