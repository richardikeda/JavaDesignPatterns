package com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles;

import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;

public class Airplane implements Vehicle {
    @Override
    public void start() {
        System.out.println("Avião ligado");
    }

    @Override
    public void stop() {
        System.out.println("Avião deslligado");
    }
}
