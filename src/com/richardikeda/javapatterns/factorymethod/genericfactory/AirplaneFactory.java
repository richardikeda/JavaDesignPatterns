package com.richardikeda.javapatterns.factorymethod.genericfactory;

public class AirplaneFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Airplane();
    }
}
