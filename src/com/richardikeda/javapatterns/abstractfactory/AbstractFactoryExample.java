package com.richardikeda.javapatterns.abstractfactory;

/**
 * Classe de exemplo para demonstrar o Abstract Factory.
 */
public class AbstractFactoryExample {

    /**
     * A aplicação escolhe o tipo de fábrica e cria-a em tempo de execução
     * (geralmente na inicialização), dependendo da configuração ou
     * variáveis de ambiente.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        System.out.println("Sistema Operacional detectado: " + osName);

        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else {
            // Assume MacOS para qualquer outro OS neste exemplo simplificado
            factory = new MacOSFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        System.out.println("--- Exemplo Abstract Factory ---");

        Application app = configureApplication();
        app.paint();

        // Demonstração da outra fábrica manualmente
        System.out.println("\n--- Simulando ambiente Windows ---");
        Application winApp = new Application(new WindowsFactory());
        winApp.paint();

        System.out.println("\n--- Simulando ambiente MacOS ---");
        Application macApp = new Application(new MacOSFactory());
        macApp.paint();
    }
}
