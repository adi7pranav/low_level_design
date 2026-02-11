package org.lld.designPatterns.structural.decorator.sample;

import org.lld.designPatterns.structural.decorator.sample.base.BaseCoffee;
import org.lld.designPatterns.structural.decorator.sample.base.impl.EspressoCoffee;
import org.lld.designPatterns.structural.decorator.sample.base.impl.MacchiatoCoffee;
import org.lld.designPatterns.structural.decorator.sample.base.impl.MachaCoffee;
import org.lld.designPatterns.structural.decorator.sample.decorator.impl.MilkDecorator;
import org.lld.designPatterns.structural.decorator.sample.decorator.impl.SugarDecorator;

public class DecoratorMain {

    static void main() {

        BaseCoffee coffee1 = new MachaCoffee();
        System.out.println("\nCoffee Order 1");
        System.out.println("Desc: " + coffee1.getDesc() + "\nCost: " + coffee1.getCost());

        BaseCoffee coffee2 = new SugarDecorator(new MilkDecorator(new EspressoCoffee()));
        System.out.println("\nCoffee Order 2");
        System.out.println("Desc: " + coffee2.getDesc() + "\nCost: " + coffee2.getCost());

        System.out.println("\nCoffee Order 3");
        BaseCoffee coffee3 = new SugarDecorator(new SugarDecorator(new MacchiatoCoffee()));
        System.out.println("Desc: " + coffee3.getDesc() + "\nCost: " + coffee3.getCost());


    }
}
