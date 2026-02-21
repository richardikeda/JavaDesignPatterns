package com.richardikeda.javapatterns.observer;

/**
 * Interface Subject que define os métodos para adicionar, remover e notificar observadores.
 */
public interface Subject {
    /**
     * Adiciona um observador.
     * @param observer O observador a ser adicionado.
     */
    void attach(Observer observer);

    /**
     * Remove um observador.
     * @param observer O observador a ser removido.
     */
    void detach(Observer observer);

    /**
     * Notifica todos os observadores registrados.
     */
    void notifyObservers();
}
