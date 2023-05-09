package com.richardikeda.javapatterns.singleton;

/**
 * Classe Singleton, que permite a criação de uma única instância de um objeto durante a execução do programa.
 */
public class Singleton {

    /**
     * Atributo estático que armazena a instância do objeto Singleton.
     * É estático para que possa ser acessado de qualquer lugar do programa.
     * É privado para evitar que seja acessado diretamente de fora da classe.
     */
    private static Singleton instance;

    /**
     * Construtor privado, que impede a criação de novas instâncias da classe Singleton.
     * Somente a própria classe pode criar a sua instância única.
     */
    private Singleton() {}

    /**
     * Método que retorna a instância única da classe Singleton.
     * Se a instância ainda não foi criada, o método a cria e a retorna.
     * Se a instância já foi criada, o método retorna a mesma instância.
     *
     * @return A instância única da classe Singleton.
     */
    public static Singleton getInstance() {
        if (instance == null) { // Verifica se a instância ainda não foi criada
            instance = new Singleton();// Cria a instância única da classe Singleton
        }
        return instance;// Retorna a instância única da classe Singleton
    }
}
