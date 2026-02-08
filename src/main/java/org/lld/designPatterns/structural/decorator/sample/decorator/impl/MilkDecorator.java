package org.lld.designPatterns.structural.decorator.sample.decorator.impl;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;
import org.lld.designPatterns.structural.decorator.sample.decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {

    private final static double MILK_COST = 20;

    public MilkDecorator(BaseCoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDesc(){
        return coffee.getDesc() + " Extra Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + MILK_COST;
    }
}
