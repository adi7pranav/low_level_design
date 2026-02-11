package org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.impl;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.interior.CarInterior;

public class LuxuryCarInterior implements CarInterior {

    private final int seats;
    private final int airbags;
    private final String seatMaterial;

    public LuxuryCarInterior() {
        this.seats = 2;
        this.airbags = 2;
        this.seatMaterial = "Leather";
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
