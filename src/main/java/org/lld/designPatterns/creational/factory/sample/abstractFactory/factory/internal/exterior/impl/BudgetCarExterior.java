package org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.impl;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.CarExterior;

public class BudgetCarExterior implements CarExterior {

    private final String exteriorMaterial;
    private final boolean reverseCam;

    public BudgetCarExterior() {
        this.exteriorMaterial = "Steel/Plastic";
        this.reverseCam = false;
    }

    @Override
    public String getExteriorMaterial() {
        return this.exteriorMaterial;
    }

    @Override
    public boolean reverseCamAvailable() {
        return this.reverseCam;
    }
}
