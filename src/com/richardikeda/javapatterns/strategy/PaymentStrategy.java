package com.richardikeda.javapatterns.strategy;

/**
 * Interface Strategy para métodos de pagamento.
 */
public interface PaymentStrategy {
    /**
     * Realiza o pagamento.
     * @param amount O valor a ser pago.
     */
    void pay(int amount);
}
