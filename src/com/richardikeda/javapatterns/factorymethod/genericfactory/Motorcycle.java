package com.richardikeda.javapatterns.factorymethod.genericfactory;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motocicleta ligada.");
    }

    @Override
    public void stop() {
        System.out.println("Motocicleta desligada.");
    }
}
