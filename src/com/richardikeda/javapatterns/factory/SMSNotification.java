package com.richardikeda.javapatterns.factory;

/**
 * Implementação concreta de Notification para envio de SMS.
 */
public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando uma notificação por SMS");
    }
}
