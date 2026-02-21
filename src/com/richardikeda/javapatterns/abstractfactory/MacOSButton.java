package com.richardikeda.javapatterns.abstractfactory;

/**
 * Implementação concreta de Button para MacOS.
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Você criou um MacOSButton.");
    }
}
