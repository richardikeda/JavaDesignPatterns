package com.richardikeda.javapatterns.observer;

/**
 * Classe de exemplo para demonstrar o uso do padrão Observer.
 */
public class ObserverExample {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel("Canal 1");
        NewsChannel observer2 = new NewsChannel("Canal 2");

        observable.attach(observer1);
        observable.attach(observer2);

        observable.setNews("Nova versão do Java lançada!");

        observable.detach(observer1);

        observable.setNews("Observer Pattern é muito útil!");
    }
}
