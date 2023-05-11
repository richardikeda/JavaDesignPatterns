package com.richardikeda.javapatterns.factorymethod.genericfactory;

public class Airplane implements  Vehicle{
    @Override
    public void start() {
        System.out.println("Avião ligado");
    }

    @Override
    public void stop() {
        System.out.println("Avião deslligado");
    }
}
