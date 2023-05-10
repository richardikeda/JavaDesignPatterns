package com.richardikeda.javapatterns.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Um exemplo de implementação utilizando o singleton para obter uma instancia de conexão.
 */
public class DatabaseExample {
    public static void main(String[] args) {
        try {
            // Obtém a instância da conexão com o banco de dados
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();

            // Obtém a conexão
            Connection connection = dbConnection.getConnection();

            // Prepara a query SQL
            String sqlQuery = "SELECT name, age FROM sample_table";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            // Executa a query e obtém o resultado
            ResultSet resultSet = statement.executeQuery();

            // Percorre o resultado e imprime as colunas name e age no console
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }

            // Fecha a conexão
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
