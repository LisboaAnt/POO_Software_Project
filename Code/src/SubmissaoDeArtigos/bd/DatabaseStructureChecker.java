/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.bd;

import java.sql.*;

public class DatabaseStructureChecker {
    public static void main(String[] args) {
        String url = "jdbc:derby:banco"; // Substitua "database_name" pelo nome do seu banco de dados
        String user = "username"; // Substitua "username" pelo nome de usuário do seu banco de dados
        String password = "password"; // Substitua "password" pela senha do seu banco de dados

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Verificando a estrutura da tabela Autor
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet columnsAutor = metaData.getColumns(null, null, "AUTOR", null);

            System.out.println("Estrutura da tabela Autor:");
            while (columnsAutor.next()) {
                String columnName = columnsAutor.getString("COLUMN_NAME");
                String dataType = columnsAutor.getString("TYPE_NAME");
                int columnSize = columnsAutor.getInt("COLUMN_SIZE");

                System.out.println("Nome da coluna: " + columnName);
                System.out.println("Tipo de dados: " + dataType);
                System.out.println("Tamanho da coluna: " + columnSize);
                System.out.println();
            }

            // Verificando a estrutura da tabela Pessoa
            ResultSet columnsPessoa = metaData.getColumns(null, null, "PESSOA", null);

            System.out.println("Estrutura da tabela Pessoa:");
            while (columnsPessoa.next()) {
                String columnName = columnsPessoa.getString("COLUMN_NAME");
                String dataType = columnsPessoa.getString("TYPE_NAME");
                int columnSize = columnsPessoa.getInt("COLUMN_SIZE");

                System.out.println("Nome da coluna: " + columnName);
                System.out.println("Tipo de dados: " + dataType);
                System.out.println("Tamanho da coluna: " + columnSize);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
