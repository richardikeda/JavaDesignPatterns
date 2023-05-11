package com.richardikeda.javapatterns.factorymethod.simplefactory;

public class Main {
    public static void main(String[] args) {
        // Criando um carro usando o Factory Method
        Vehicle car = SimpleVehicleFactory.createVehicle("car");
        car.start(); // Saída: Carro ligado.
        car.stop();  // Saída: Carro desligado.

        // Criando uma motocicleta usando o Factory Method
        Vehicle motorcycle = SimpleVehicleFactory.createVehicle("motorcycle");
        motorcycle.start(); // Saída: Motocicleta ligada.
        motorcycle.stop();  // Saída: Motocicleta desligada.

        // Criando uma lancha usando o Factory Method
        Vehicle speedboat = SimpleVehicleFactory.createVehicle("speedboat");
        speedboat.start(); // Saída: Lancha ligada
        speedboat.stop();  // Saída: Lancha desligada.
    }
}