package org.lld.designPatterns.creational.factory.sample.abstractFactory;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.CarExterior;
import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.CarInterior;

public class Car {

    CarExterior carExterior;
    CarInterior carInterior;

    public Car(CarExterior carExterior, CarInterior carInterior) {
        this.carExterior = carExterior;
        this.carInterior = carInterior;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carExterior={" +
                "exteriorMaterial='" + carExterior.getExteriorMaterial() + '\'' +
                ", reverseCamAvailable=" + carExterior.reverseCamAvailable() +
                "}," +
                " carInterior={" +
                "airBags=" + carInterior.getAirBags() +
                ", seats=" + carInterior.getSeats() +
                ", seatMaterial='" + carInterior.getSeatMaterial() + '\'' +
                "}" +
                '}';
    }

}
