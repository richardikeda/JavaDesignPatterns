package com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles.car;

import com.richardikeda.javapatterns.factorymethod.genericfactory.vehicles.Car;

public class Gol extends Car {

    @Override
    public void start() {
        System.out.println("Carro Ligado");
    }

    @Override
    public void stop() {
        System.out.println("Carro Ligado");
    }

    @Override
    public void buzina() {
        System.out.println("Beep");
    }
}
