package com.richardikeda.javapatterns.factorymethod.genericfactory;

public class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de carros
        VehicleFactory carFactory = new CarFactory();
        // Criando um carro usando a fábrica de carros
        Vehicle car = carFactory.createVehicle();
        car.start(); // Saída: Carro ligado.
        car.stop();  // Saída: Carro desligado.

        // Criando uma fábrica de motos
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        // Criando uma moto usando a fábrica de motos
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.start(); // Saída: Motocicleta ligada.
        motorcycle.stop();  // Saída: Motocicleta desligada.

        // Criando uma fábrica de lanchas (speedboats)
        VehicleFactory speedboatFactory = new SpeedboatFactory();
        // Criando uma lancha usando a fábrica de lanchas
        Vehicle speedboat = speedboatFactory.createVehicle();
        speedboat.start(); // Saída: Lancha ligada
        speedboat.stop();  // Saída: Lancha desligada.

        // Criando uma fábrica de aviões
        VehicleFactory airplaneFactory = new AirplaneFactory();
        // Criando uma lancha usando a fábrica de lanchas
        Vehicle airplane = airplaneFactory.createVehicle();
        airplane.start(); // Saída: Avião ligado
        airplane.stop();  // Saída: Avião Desligado


    }
}