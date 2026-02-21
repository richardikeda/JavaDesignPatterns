package com.richardikeda.javapatterns.abstractfactory;

/**
 * Abstract Factory conhece todos os tipos de produtos abstratos.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
