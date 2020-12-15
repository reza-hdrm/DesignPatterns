package com.rezahdrm.structural.bridge.shape2D;

import com.rezahdrm.structural.bridge.color.Blue;
import com.rezahdrm.structural.bridge.color.Red;
import org.junit.Test;

import static org.junit.Assert.*;

public class bridgeTest {
    @Test
    public void patternTest() {
        Circle circle=new Circle(new Red());
        Rectangle rectangle=new Rectangle(new Blue());
        circle.draw();
        circle.applyColor();
        rectangle.draw();
        rectangle.applyColor();
    }
}