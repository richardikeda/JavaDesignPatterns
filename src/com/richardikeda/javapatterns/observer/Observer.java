package com.richardikeda.javapatterns.observer;

/**
 * Interface Observer que define o método de atualização.
 */
public interface Observer {
    /**
     * Atualiza o observador com a notícia.
     * @param news A notícia.
     */
    void update(String news);
}
