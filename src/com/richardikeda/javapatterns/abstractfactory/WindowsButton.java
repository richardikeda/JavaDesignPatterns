package com.richardikeda.javapatterns.abstractfactory;

/**
 * Implementação concreta de Button para Windows.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Você criou um WindowsButton.");
    }
}
