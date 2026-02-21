package com.richardikeda.javapatterns.factory;

/**
 * Implementação concreta de Notification para envio de E-mail.
 */
public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Enviando uma notificação por E-mail");
    }
}
