package com.richardikeda.javapatterns.factorymethod.simplefactory;
/**
 * A classe SimpleVehicleFactory é responsável por criar instâncias de veículos com base no tipo fornecido.
 * Ela fornece um método estático createVehicle() que recebe um tipo como entrada e retorna o objeto de veículo correspondente.
 */
public class SimpleVehicleFactory {
    /**
     * Cria um objeto de veículo com base no tipo fornecido.
     *
     * @param type O tipo de veículo a ser criado ("car", "motorcycle", "speedboat").
     * @return Uma instância do tipo de veículo solicitado.
     * @throws IllegalArgumentException Se o tipo de veículo for inválido ou não suportado.
     */
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "motorcycle":
                return new Motorcycle();
            case "speedboat":
                return new Speedboat();
            default:
                throw new IllegalArgumentException("Tipo de veículo inválido.");
        }
    }
}
