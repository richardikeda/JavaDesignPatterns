package com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles;

import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;
import com.richardikeda.javapatterns.factorymethod.genericfactory.VehicleAction;
import com.richardikeda.javapatterns.factorymethod.genericfactory.VehicleBase;

public interface Car extends Vehicle {
    public abstract void buzina();
}
