package com.richardikeda.javapatterns.abstractfactory;

/**
 * Factory concreta que produz a família de produtos para Windows.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
