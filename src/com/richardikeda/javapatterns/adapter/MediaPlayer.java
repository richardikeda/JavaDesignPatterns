package com.richardikeda.javapatterns.adapter;

/**
 * Interface alvo que o cliente espera usar.
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
