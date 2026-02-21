package com.richardikeda.javapatterns.factory;

/**
 * Classe de exemplo para demonstrar o uso do padrão Factory.
 */
public class FactoryExample {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        // Cria uma notificação de SMS
        Notification notification1 = notificationFactory.createNotification("SMS");
        notification1.notifyUser();

        // Cria uma notificação de E-mail
        Notification notification2 = notificationFactory.createNotification("EMAIL");
        notification2.notifyUser();

        // Cria uma notificação Push
        Notification notification3 = notificationFactory.createNotification("PUSH");
        notification3.notifyUser();
    }
}
