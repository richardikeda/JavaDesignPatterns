package com.richardikeda.javapatterns.factory;

/**
 * Classe Factory responsável por criar instâncias de notificações.
 */
public class NotificationFactory {

    /**
     * Cria uma instância de Notification com base no tipo fornecido.
     *
     * @param channel O tipo de canal de notificação (SMS, EMAIL, PUSH).
     * @return Uma instância de Notification correspondente ou null se o tipo for desconhecido.
     */
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        switch (channel.toUpperCase()) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Canal de notificação desconhecido: " + channel);
        }
    }
}
