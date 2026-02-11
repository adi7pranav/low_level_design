package org.lld.designPatterns.creational.factory.sample.simple.shape.impl;

import org.lld.designPatterns.creational.factory.sample.simple.shape.Shape;

public class Circle implements Shape {
    @Override
    public double calcArea() {
        return 3.14;
    }

    @Override
    public String desc() {
        return "It is a circle";
    }
}
