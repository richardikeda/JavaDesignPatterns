package com.richardikeda.javapatterns.abstractfactory;

/**
 * Factory concreta que produz a família de produtos para MacOS.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
