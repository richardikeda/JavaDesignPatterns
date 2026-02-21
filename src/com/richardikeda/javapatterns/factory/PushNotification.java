package com.richardikeda.javapatterns.factory;

/**
 * Implementação concreta de Notification para envio de Push Notification.
 */
public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando uma notificação Push");
    }
}
