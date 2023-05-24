package com.richardikeda.javapatterns.factorymethod.genericfactory.factory;

import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;

// Classe abstrata para a Factory
public interface VehicleFactory {
    Vehicle createVehicle();
}
