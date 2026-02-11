package org.lld.designPatterns.creational.factory.sample.simple.shape;

import org.lld.designPatterns.creational.factory.sample.simple.enums.ShapeType;
import org.lld.designPatterns.creational.factory.sample.simple.shape.impl.Circle;
import org.lld.designPatterns.creational.factory.sample.simple.shape.impl.Square;

public class ShapeFactory {
    // does both selection and creation, violated Single Responsibility, also OpenClosed principle
    public static Shape getShape(ShapeType shapeType){
        if(shapeType == ShapeType.CIRCLE) {
            return new Circle();
        }
        if(shapeType == ShapeType.SQUARE) {
            return new Square();
        }
        throw new RuntimeException("Invalid Shape");
    }
}
