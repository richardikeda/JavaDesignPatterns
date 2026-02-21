package com.richardikeda.javapatterns.observer;

/**
 * Implementação concreta de Observer, representando um canal de notícias.
 */
public class NewsChannel implements Observer {
    private String news;
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println(channelName + " recebeu a notícia: " + this.news);
    }
}
