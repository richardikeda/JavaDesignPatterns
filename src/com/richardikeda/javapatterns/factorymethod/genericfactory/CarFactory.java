package com.richardikeda.javapatterns.factorymethod.genericfactory;

// Implementação da Factory para criar carros
public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
