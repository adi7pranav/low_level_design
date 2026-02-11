package org.lld.designPatterns.creational.factory.sample.factoryMethod;


import org.lld.designPatterns.creational.factory.sample.factoryMethod.enums.ShapeType;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.Shape;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.ShapeFactoryMethod;

public class FactoryMethodMain {
    static void main() {
        Shape triangle = ShapeFactoryMethod.getShape(ShapeType.TRIANGLE);
        System.out.println("Shape 1 :");
        System.out.println("Desc: " + triangle.desc() + "\nArea: " + triangle.calcArea());

        Shape rectangle = ShapeFactoryMethod.getShape(ShapeType.RECTANGLE);
        System.out.println("\nShape 2 :");
        System.out.println("Desc: " + rectangle.desc() + "\nArea: " + rectangle.calcArea());
    }
}
