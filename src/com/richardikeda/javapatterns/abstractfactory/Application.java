package com.richardikeda.javapatterns.abstractfactory;

/**
 * O código cliente trabalha com fábricas e produtos apenas através de tipos abstratos:
 * GUIFactory, Button e Checkbox.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
