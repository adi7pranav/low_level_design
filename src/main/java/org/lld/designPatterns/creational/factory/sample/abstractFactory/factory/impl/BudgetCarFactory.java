package org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.impl;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.CarFactory;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.CarExterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.impl.BudgetCarExterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.CarInterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.impl.BudgetCarInterior;

public class BudgetCarFactory implements CarFactory {
    @Override
    public CarInterior createCarInterior() {
        return new BudgetCarInterior();
    }

    @Override
    public CarExterior createCarExterior() {
        return new BudgetCarExterior();
    }
}
