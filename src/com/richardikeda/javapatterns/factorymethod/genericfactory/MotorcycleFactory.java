package com.richardikeda.javapatterns.factorymethod.genericfactory;

// Implementação da Factory para criar motos
public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
