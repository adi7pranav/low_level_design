package org.lld.designPatterns.structural.decorator.sample.decorator.impl;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;
import org.lld.designPatterns.structural.decorator.sample.decorator.CoffeeDecorator;

public class CreamDecorator extends CoffeeDecorator {

    private final static double CREAM_COST = 30;

    public CreamDecorator(BaseCoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDesc(){
        return coffee.getDesc() + " Extra Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + CREAM_COST;
    }
}
