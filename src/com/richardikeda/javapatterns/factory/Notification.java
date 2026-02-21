package com.richardikeda.javapatterns.factory;

/**
 * Interface Notification que define o contrato para os diferentes tipos de notificação.
 */
public interface Notification {
    /**
     * Método responsável por notificar o usuário.
     */
    void notifyUser();
}
