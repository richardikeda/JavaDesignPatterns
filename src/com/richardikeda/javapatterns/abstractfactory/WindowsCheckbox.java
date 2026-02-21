package com.richardikeda.javapatterns.abstractfactory;

/**
 * Implementação concreta de Checkbox para Windows.
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Você criou um WindowsCheckbox.");
    }
}
