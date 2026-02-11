package org.lld.designPatterns.creational.factory.sample.abstractFactory;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.CarFactory;

public class AbstractFactoryMain {

    static void printCarInfo(Car car) {

        System.out.println("CarExterior : " +
                "\n\tExternal Material : " + car.carExterior.getExteriorMaterial()
                + "\n\tReverse CamAvailable : " + car.carExterior.reverseCamAvailable());
        System.out.println("CarInterior : " +
                "\n\tSeat Material : " + car.carInterior.getSeatMaterial()
                + "\n\tNo of Seats : " + car.carInterior.getSeats()
                + "\n\tAirBags : " + car.carInterior.getAirBags()
        );

    }

    static void main() {
        System.out.println("\nLuxury Car:");
        CarFactory luxuryCarFactory = CarFactoryProvider.getCarFactory(FactoryType.LUXURY);
        Car luxuryCar = luxuryCarFactory.produceCompleteVehicle();
        printCarInfo(luxuryCar);
//        System.out.println(luxuryCar.toString());

        System.out.println("\nBudget Car:");
        CarFactory budgetCarFactory = CarFactoryProvider.getCarFactory(FactoryType.BUDGET);
        Car budgetCar = budgetCarFactory.produceCompleteVehicle();
        printCarInfo(budgetCar);

//        System.out.println(budgetCar.toString());
    }
}
