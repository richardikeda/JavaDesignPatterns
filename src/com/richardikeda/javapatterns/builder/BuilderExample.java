package com.richardikeda.javapatterns.builder;

/**
 * Exemplo de uso do padrão Builder para construir um objeto Computer.
 * O Builder permite construir objetos complexos passo a passo.
 */
public class BuilderExample {
    public static void main(String[] args) {
        // Criando um computador com configuração básica
        Computer basicComputer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        // Criando um computador com configuração avançada
        Computer gamingComputer = new Computer.ComputerBuilder("1 TB", "16 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
