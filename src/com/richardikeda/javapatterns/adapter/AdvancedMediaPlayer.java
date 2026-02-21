package com.richardikeda.javapatterns.adapter;

/**
 * Interface Adaptee que possui a funcionalidade que precisa ser adaptada.
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
