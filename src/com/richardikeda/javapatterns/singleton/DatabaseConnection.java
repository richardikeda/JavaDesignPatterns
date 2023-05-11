package com.richardikeda.javapatterns.singleton;

// Importação de pacotes SQL para gerir a conexão com o banco de dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exemplo de classe Singleton, que permite a criação de uma única instância para conexão de banco de dados.
 */
public class DatabaseConnection {
    /**
     * Atributo estático que armazena a instância do objeto DatabaseConnection.
     * É estático para que possa ser acessado de qualquer lugar do programa.
     * É privado para evitar que seja acessado diretamente de fora dessa classe.
     */
    private static DatabaseConnection instance;
    /**
     * Atributo privado que armazena a conexão com o banco de dados;
     * É privado para que não seja editado e acessado diretamente de fora dessa classe.
     */
    private final Connection connection;

    /**
     * Construtor privado da classe DatabaseConnection.
     * Cria a conexão com o banco de dados ao instanciar o objeto.
     * @throws SQLException se ocorrer um erro ao criar a conexão
     */
    private DatabaseConnection() throws SQLException {
        // Cria a conexão com o banco de dados usando JDBC
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
    }
    /**
     * Método estático que retorna a instância única da classe DatabaseConnection.
     * Se a instância ainda não foi criada, cria a instância e retorna.
     * @return a instância única da classe DatabaseConnection
     * @throws SQLException se ocorrer um erro ao criar a conexão
     */
    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    /**
     * Metodo que retorna a conexão com o banco de dados.
     * @return a conexão com o banco de dados
     */
    public Connection getConnection() {
        return connection;
    }
}
