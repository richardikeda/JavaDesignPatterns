package com.richardikeda.javapatterns.strategy;

/**
 * Implementação concreta de Strategy usando PayPal.
 */
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pago usando Paypal.");
    }
}
