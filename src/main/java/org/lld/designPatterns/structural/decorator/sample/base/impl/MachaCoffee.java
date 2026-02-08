package org.lld.designPatterns.structural.decorator.sample.base.impl;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;

public class MachaCoffee implements BaseCoffee {
    @Override
    public String getDesc() {
        return "Base Macha";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
