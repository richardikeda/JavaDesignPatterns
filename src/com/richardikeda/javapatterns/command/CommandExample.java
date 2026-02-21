package com.richardikeda.javapatterns.command;

/**
 * Exemplo de uso do padrão Command.
 * O RemoteControl (Invoker) executa comandos que encapsulam ações na Light (Receiver).
 */
public class CommandExample {
    public static void main(String[] args) {
        // Receptor
        Light light = new Light();

        // Comandos Concretos
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        // Invocador
        RemoteControl remote = new RemoteControl();

        // Ligar a luz
        remote.setCommand(lightOn);
        remote.pressButton();

        // Desligar a luz
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
