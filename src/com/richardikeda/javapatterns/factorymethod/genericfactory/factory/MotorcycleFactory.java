package com.richardikeda.javapatterns.factorymethod.genericfactory.factory;

import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;
import com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles.Motorcycle;

// Implementação da Factory para criar motos
public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
