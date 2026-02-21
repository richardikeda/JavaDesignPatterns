package com.richardikeda.javapatterns.strategy;

/**
 * Classe de exemplo para demonstrar o uso do padrão Strategy.
 */
public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pagar com Paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        // Pagar com Cartão de Crédito
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
