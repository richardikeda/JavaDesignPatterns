package com.richardikeda.javapatterns.abstractfactory;

/**
 * Implementação concreta de Checkbox para MacOS.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Você criou um MacOSCheckbox.");
    }
}
