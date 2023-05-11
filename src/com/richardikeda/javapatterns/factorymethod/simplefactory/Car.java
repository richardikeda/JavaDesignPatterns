package com.richardikeda.javapatterns.factorymethod.simplefactory;


/**
 * Uma classe carro que implementa os metodos da interface Veículo.
 */
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