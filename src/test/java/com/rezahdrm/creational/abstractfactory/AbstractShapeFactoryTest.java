package com.rezahdrm.creational.abstractfactory;

import com.rezahdrm.creational.abstractfactory.factory.AbstractShapeFactory;
import com.rezahdrm.creational.abstractfactory.factory.ShapeFactory;
import com.rezahdrm.creational.abstractfactory.shape3D.Cone;
import com.rezahdrm.creational.abstractfactory.shape3D.Cuboid;
import com.rezahdrm.creational.abstractfactory.shape2D.Circle;
import com.rezahdrm.creational.abstractfactory.shape2D.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractShapeFactoryTest {

    @Test
    void testShape() {
        AbstractShapeFactory abstractShape2DFactory = ShapeFactory.getShapeFactory(ShapeFactory.ShapeFactoryType.SHAPE2D);
        AbstractShapeFactory abstractShape3DFactory = ShapeFactory.getShapeFactory(ShapeFactory.ShapeFactoryType.SHAPE3D);
        Shape circle = abstractShape2DFactory.getShape(AbstractShapeFactory.ShapeType.CIRCLE);
        Shape rectangle = abstractShape2DFactory.getShape(AbstractShapeFactory.ShapeType.RECTANGLE);
        Shape cone = abstractShape3DFactory.getShape(AbstractShapeFactory.ShapeType.CONE);
        Shape cuboid = abstractShape3DFactory.getShape(AbstractShapeFactory.ShapeType.CUBOID);
        Assertions.assertTrue(circle instanceof Circle);
        Assertions.assertTrue(rectangle instanceof Rectangle);
        Assertions.assertTrue(cone instanceof Cone);
        Assertions.assertTrue(cuboid instanceof Cuboid);
    }
}