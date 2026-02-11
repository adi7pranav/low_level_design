package org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.impl;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.CarFactory;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.CarExterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.impl.LuxuryCarExterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.CarInterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.impl.LuxuryCarInterior;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public CarInterior createCarInterior() {
        return new LuxuryCarInterior();
    }

    @Override
    public CarExterior createCarExterior() {
        return new LuxuryCarExterior();
    }
}
