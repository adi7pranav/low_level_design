package org.lld.designPatterns.creational.factory.sample.simple;

import org.lld.designPatterns.creational.factory.sample.simple.enums.ShapeType;
import org.lld.designPatterns.creational.factory.sample.simple.shape.Shape;
import org.lld.designPatterns.creational.factory.sample.simple.shape.ShapeFactory;

public class SimpleFactoryMain {

    static void main() {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        System.out.println("Shape 1 :");
        System.out.println("Desc: " + circle.desc() + "\nArea: " + circle.calcArea());

        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        System.out.println("\nShape 2 :");
        System.out.println("Desc: " + square.desc() + "\nArea: " + square.calcArea());
    }
}
