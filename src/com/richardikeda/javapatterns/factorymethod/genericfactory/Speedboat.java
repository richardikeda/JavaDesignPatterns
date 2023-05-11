package com.richardikeda.javapatterns.factorymethod.genericfactory;

public class Speedboat implements Vehicle {

    @Override
    public void start() {
        System.out.println("Lancha ligada.");
    }

    @Override
    public void stop() {
        System.out.println("Lancha desligada.");
    }
}
