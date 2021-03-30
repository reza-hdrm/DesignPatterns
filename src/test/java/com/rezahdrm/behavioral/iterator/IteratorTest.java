package com.rezahdrm.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    @Test
    void iteratorTest() {
        assertDoesNotThrow(() -> {
            try {
                FileContentReader fileContentReader = new FileContentReader("");
                for (String s : fileContentReader) System.out.println(s);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}