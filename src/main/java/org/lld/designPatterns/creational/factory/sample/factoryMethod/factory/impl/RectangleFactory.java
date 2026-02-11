package org.lld.designPatterns.creational.factory.sample.factoryMethod.factory.impl;


import org.lld.designPatterns.creational.factory.sample.factoryMethod.factory.ShapeFactory;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.Shape;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.impl.Rectangle;
import org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.impl.Triangle;

public class RectangleFactory implements ShapeFactory {

    // creation logic here
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
