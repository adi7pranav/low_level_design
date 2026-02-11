package org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.impl;

import org.lld.designPatterns.creational.factory.sample.factoryMethod.shape.Shape;

public class Triangle implements Shape {
    @Override
    public double calcArea() {
        return 5;
    }

    @Override
    public String desc() {
        return "It is a triangle";
    }
}
