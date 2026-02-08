package org.lld.designPatterns.structural.decorator.sample.base.impl;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;

public class EspressoCoffee implements BaseCoffee {
    @Override
    public String getDesc() {
        return "Base Espresso";
    }

    @Override
    public double getCost() {
        return 80;
    }
}
