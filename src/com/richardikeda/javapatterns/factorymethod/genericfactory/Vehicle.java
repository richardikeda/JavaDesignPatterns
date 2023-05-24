package com.richardikeda.javapatterns.factorymethod.genericfactory;

/**
 * Classe abstrata que requisita a implementação
 * das ações do veiculo (andar, parar)
 */
public abstract class Vehicle implements VehicleAction{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
