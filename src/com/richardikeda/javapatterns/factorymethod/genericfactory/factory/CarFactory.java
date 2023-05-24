package com.richardikeda.javapatterns.factorymethod.genericfactory.factory;

import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;
import com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles.Car;

// Implementação da Factory para criar carros
public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
