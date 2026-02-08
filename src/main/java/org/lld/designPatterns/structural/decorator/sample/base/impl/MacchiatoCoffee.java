package org.lld.designPatterns.structural.decorator.sample.base.impl;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;

public class MacchiatoCoffee implements BaseCoffee {
    @Override
    public String getDesc() {
        return "Base MacchiatoCoffee";
    }

    @Override
    public double getCost() {
        return 120;
    }
}
