package com.richardikeda.javapatterns.factorymethod.genericfactory.factory;

import com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles.Speedboat;
import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;

public class SpeedboatFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Speedboat();
    }
}
