package org.lld.designPatterns.creational.factory.sample.abstractFactory;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.CarFactory;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.impl.BudgetCarFactory;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.impl.LuxuryCarFactory;

public class CarFactoryProvider {

    public static CarFactory getCarFactory(FactoryType factoryType){
        return switch (factoryType) {
            case BUDGET -> new BudgetCarFactory();
            case LUXURY -> new LuxuryCarFactory();
            default -> throw new RuntimeException("Invalid factory type: " + factoryType);
        };

    }
}
