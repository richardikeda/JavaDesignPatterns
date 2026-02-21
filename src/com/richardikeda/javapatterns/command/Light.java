package com.richardikeda.javapatterns.command;

/**
 * Receiver (Receptor) que realiza a ação real.
 */
public class Light {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}
