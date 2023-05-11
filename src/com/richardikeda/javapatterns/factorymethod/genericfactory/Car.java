package com.richardikeda.javapatterns.factorymethod.genericfactory;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Carro ligado.");
    }
    @Override
    public void stop() {
        System.out.println("Carro desligado.");
    }
}
