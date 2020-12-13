package com.rezahdrm.creational.abstractfactory.factory;

import com.rezahdrm.creational.abstractfactory.Shape;
import com.rezahdrm.creational.abstractfactory.shape3D.Cone;
import com.rezahdrm.creational.abstractfactory.shape3D.Cuboid;
import com.rezahdrm.creational.abstractfactory.shape2D.Circle;
import com.rezahdrm.creational.abstractfactory.shape2D.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class AbstractShapeFactoryTest {

    @Test
    public void getShape() {
        AbstractShapeFactory abstractShape2DFactory=ShapeFactory.getShapeFactory(ShapeFactory.ShapeFactoryType.SHAPE2D);
        AbstractShapeFactory abstractShape3DFactory=ShapeFactory.getShapeFactory(ShapeFactory.ShapeFactoryType.SHAPE3D);
        Shape circle=abstractShape2DFactory.getShape(AbstractShapeFactory.ShapeType.CIRCLE);
        Shape rectangle=abstractShape2DFactory.getShape(AbstractShapeFactory.ShapeType.RECTANGLE);
        Shape cone=abstractShape3DFactory.getShape(AbstractShapeFactory.ShapeType.CONE);
        Shape cuboid=abstractShape3DFactory.getShape(AbstractShapeFactory.ShapeType.CUBOID);
        Assert.assertTrue(circle instanceof Circle);
        Assert.assertTrue(rectangle instanceof Rectangle);
        Assert.assertTrue(cone instanceof Cone);
        Assert.assertTrue(cuboid instanceof Cuboid);
    }
}