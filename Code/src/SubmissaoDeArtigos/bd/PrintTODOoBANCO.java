/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.bd;

import java.sql.*;
//Para mostrar você deve executar essa classe, de preferência separadamente, clicando run file
public class PrintTODOoBANCO {
    public static void main(String[] args) {
        try {
            // Estabelecer a conexão com o banco de dados Derby
            Connection conn = DriverManager.getConnection("jdbc:derby:banco");

            // Obter os metadados do banco de dados
            DatabaseMetaData metaData = conn.getMetaData();

            // Obter os nomes de todas as tabelas
            ResultSet tableResultSet = metaData.getTables(null, null, null, new String[]{"TABLE"});

            // Iterar sobre as tabelas
            while (tableResultSet.next()) {
                String tableName = tableResultSet.getString("TABLE_NAME");

                // Imprimir o nome da tabela
                System.out.println("Tabela: " + tableName);

                // Consultar todos os dados da tabela
                Statement stmt = conn.createStatement();
                ResultSet dataResultSet = stmt.executeQuery("SELECT * FROM " + tableName);

                // Obter os metadados das colunas
                ResultSetMetaData columnMetaData = dataResultSet.getMetaData();
                int columnCount = columnMetaData.getColumnCount();

                // Iterar sobre as linhas de dados
                while (dataResultSet.next()) {
                    // Imprimir os valores das colunas
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = columnMetaData.getColumnName(i);
                        String columnValue = dataResultSet.getString(i);
                        System.out.println(columnName + ": " + columnValue);
                    }
                    System.out.println("--------------------");
                }

                // Fechar o ResultSet e o Statement
                dataResultSet.close();
                stmt.close();

                System.out.println();
            }

            // Fechar a conexão com o banco de dados
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

