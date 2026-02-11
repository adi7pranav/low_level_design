package org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.impl;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.CarInterior;

public class BudgetCarInterior implements CarInterior {

    private final int seats;
    private final int airbags;
    private final String seatMaterial;

    public BudgetCarInterior() {
        this.seats = 4;
        this.airbags = 2;
        this.seatMaterial = "Plastic";
    }

    @Override
    public int getSeats() {
        return this.seats;
    }

    @Override
    public int getAirBags() {
        return this.airbags;
    }

    @Override
    public String getSeatMaterial() {
        return this.seatMaterial;
    }
}
