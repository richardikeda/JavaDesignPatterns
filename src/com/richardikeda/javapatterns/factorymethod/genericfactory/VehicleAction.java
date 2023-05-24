package com.richardikeda.javapatterns.factorymethod.genericfactory;

/**
 * Interface que define os metodos das ações que posso fazer em um veículo
 */
public interface VehicleAction {
    void start(); // Um veiculo pode ligar
    void stop(); // Um veiculo pode desligar
}
