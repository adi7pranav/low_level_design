package org.lld.designPatterns.creational.factory.sample.factoryMethod.shape;

import org.lld.designPatterns.creational.factory.sample.factoryMethod.enums.ShapeType;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.factory.ShapeFactory;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.factory.impl.RectangleFactory;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.factory.impl.TriangleFactory;


public class ShapeFactoryMethod {
    // Only responsible for selection, solves Single responsibility, but not open closed
    public static Shape getShape(ShapeType shapeType){
        ShapeFactory shapeFactory;
        if(shapeType == ShapeType.RECTANGLE) {
            shapeFactory = new TriangleFactory();
        }
        else if(shapeType == ShapeType.TRIANGLE) {
            shapeFactory = new RectangleFactory();
        }
        else {
            throw new RuntimeException("Invalid Shape");
        }

        return shapeFactory.createShape(); // handles creation internally
    }
}
