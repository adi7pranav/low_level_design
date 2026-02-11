package org.lld.designPatterns.creational.factory.sample.simple.shape.impl;

import org.lld.designPatterns.creational.factory.sample.simple.shape.Shape;

public class Square implements Shape {
    @Override
    public double calcArea() {
        return 1;
    }

    @Override
    public String desc() {
        return "It is a square";
    }
}
