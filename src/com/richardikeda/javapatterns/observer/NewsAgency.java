package com.richardikeda.javapatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação concreta de Subject, representando uma agência de notícias.
 */
public class NewsAgency implements Subject {
    private String news;
    private List<Observer> channels = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        this.channels.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.channels.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : channels) {
            observer.update(this.news);
        }
    }

    /**
     * Define a nova notícia e notifica os observadores.
     * @param news A nova notícia.
     */
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
