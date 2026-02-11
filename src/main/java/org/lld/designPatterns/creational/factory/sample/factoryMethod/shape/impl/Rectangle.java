package org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.impl;

import org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public double calcArea() {
        return 2;
    }

    @Override
    public String desc() {
        return "It is a rectangle";
    }
}
