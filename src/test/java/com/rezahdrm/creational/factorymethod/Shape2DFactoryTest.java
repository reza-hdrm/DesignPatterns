package com.rezahdrm.creational.factorymethod;

import com.rezahdrm.creational.factorymethod.shape2D.Circle;
import com.rezahdrm.creational.factorymethod.shape2D.Rectangle;
import com.rezahdrm.creational.factorymethod.shape2D.Shape2D;
import com.rezahdrm.creational.factorymethod.shape2D.Square;
import org.junit.Assert;
import org.junit.Test;

public class Shape2DFactoryTest {

    @Test
    public void getInstance() {
        Shape2D circle= Shape2DFactory.getInstance(Shape2D.Shape2DType.CIRCLE);
        Shape2D rectangle= Shape2DFactory.getInstance(Shape2D.Shape2DType.RECTANGLE);
        Shape2D square= Shape2DFactory.getInstance(Shape2D.Shape2DType.SQUARE);
        Assert.assertTrue(circle instanceof Circle);
        Assert.assertTrue(rectangle instanceof Rectangle);
        Assert.assertTrue(square instanceof Square);
    }
}