package com.rezahdrm.structural.bridge.shape2D;

import com.rezahdrm.structural.bridge.color.Blue;
import com.rezahdrm.structural.bridge.color.Red;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BridgeTest {
    @Test
    void patternTest() {
        Assertions.assertDoesNotThrow(() -> {
            Circle circle = new Circle(new Red());
            Rectangle rectangle = new Rectangle(new Blue());
            circle.draw();
            circle.applyColor();
            rectangle.draw();
            rectangle.applyColor();
        });
    }
}