package org.lld.designPatterns.structural.decorator.sample.decorator;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;

public abstract class CoffeeDecorator implements BaseCoffee {
    public BaseCoffee coffee;

    public CoffeeDecorator(BaseCoffee coffee) {
        this.coffee = coffee;
    }
}
