package com.richardikeda.javapatterns.factorymethod.SimpleFactory;

/**
 * Uma classe motocicleta que implementa os metodos da interface Veículo.
 */
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
