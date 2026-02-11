package org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.impl;

import org.lld.designPatterns.creational.factory.sample.abstractFactory.factory.internal.exterior.CarExterior;

public class LuxuryCarExterior implements CarExterior {

    private final String exteriorMaterial;
    private final boolean reverseCam;

    public LuxuryCarExterior() {
        this.exteriorMaterial = "Carbon Fibre";
        this.reverseCam = true;
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
