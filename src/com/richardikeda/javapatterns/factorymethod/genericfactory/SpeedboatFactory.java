package com.richardikeda.javapatterns.factorymethod.genericfactory;

public class SpeedboatFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Speedboat();
    }
}
