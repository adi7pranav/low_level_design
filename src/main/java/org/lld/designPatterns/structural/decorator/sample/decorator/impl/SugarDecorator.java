package org.lld.designPatterns.structural.decorator.sample.decorator.impl;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;
import org.lld.designPatterns.structural.decorator.sample.decorator.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {

    private final static double SUGAR_COST = 10;

    public SugarDecorator(BaseCoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDesc(){
        return coffee.getDesc() + " Extra Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + SUGAR_COST;
    }
}
