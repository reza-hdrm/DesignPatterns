package com.rezahdrm.creational.factorymethod;

import com.rezahdrm.creational.factorymethod.shape2D.Circle;
import com.rezahdrm.creational.factorymethod.shape2D.Rectangle;
import com.rezahdrm.creational.factorymethod.shape2D.Shape2D;
import com.rezahdrm.creational.factorymethod.shape2D.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryShape2DTest {

    @Test
    public void getInstance() {
        Shape2D circle=FactoryShape2D.getInstance(Shape2D.TypeShape2D.CIRCLE);
        Shape2D rectangle=FactoryShape2D.getInstance(Shape2D.TypeShape2D.RECTANGLE);
        Shape2D square=FactoryShape2D.getInstance(Shape2D.TypeShape2D.SQUARE);
        Assert.assertTrue(circle instanceof Circle);
        Assert.assertTrue(rectangle instanceof Rectangle);
        Assert.assertTrue(square instanceof Square);
    }
}