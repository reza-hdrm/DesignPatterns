package com.rezahdrm.creational.factorymethod;

import com.rezahdrm.creational.factorymethod.shape2D.Circle;
import com.rezahdrm.creational.factorymethod.shape2D.Rectangle;
import com.rezahdrm.creational.factorymethod.shape2D.Shape2D;
import com.rezahdrm.creational.factorymethod.shape2D.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Shape2DFactoryTest {

    @Test
    void getInstance() {
        Shape2D circle = Shape2DFactory.getInstance(Shape2D.Shape2DType.CIRCLE);
        Shape2D rectangle = Shape2DFactory.getInstance(Shape2D.Shape2DType.RECTANGLE);
        Shape2D square = Shape2DFactory.getInstance(Shape2D.Shape2DType.SQUARE);
        Assertions.assertTrue(circle instanceof Circle);
        Assertions.assertTrue(rectangle instanceof Rectangle);
        Assertions.assertTrue(square instanceof Square);
    }
}