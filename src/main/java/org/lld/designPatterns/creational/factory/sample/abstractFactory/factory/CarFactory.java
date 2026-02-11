package org.lld.designPatterns.creational.factory.sample.abstractFactory.factory;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.Car;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.CarExterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.CarInterior;

public interface CarFactory {

    CarInterior createCarInterior();

    CarExterior createCarExterior();

    default Car produceCompleteVehicle(){
        return new Car(createCarExterior(), createCarInterior());
    }

}
