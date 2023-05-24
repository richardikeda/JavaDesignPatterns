package com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles;

import com.richardikeda.javapatterns.factorymethod.genericfactory.Vehicle;

public class Motorcycle implements Vehicle {
    private int cilindrada;

    public Motorcycle() { }

    @Override
    public void start() {
        System.out.println("Motocicleta ligada.");
    }

    @Override
    public void stop() {
        System.out.println("Motocicleta desligada.");
    }



}
