package com.richardikeda.javapatterns.factorymethod.genericfactory.factory;

import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;
import com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles.Airplane;

public class AirplaneFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Airplane();
    }
}
