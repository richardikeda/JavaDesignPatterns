package com.richardikeda.javapatterns.command;

/**
 * Invoker (Invocador) que armazena e executa comandos.
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
