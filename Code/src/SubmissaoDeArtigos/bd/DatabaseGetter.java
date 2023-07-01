
package SubmissaoDeArtigos.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseGetter {
    
    public static void getDataFromDatabase() {
        Connection conn = null;
        try {
            // Estabelecer a conexão com o banco de dados
            conn = DriverManager.getConnection("jdbc:derby:banco");

            // Executar a consulta SQL
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Pessoa");

            // Processar os resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                String enderecoEmail = rs.getString("enderecoEmail");
                String vinculacao = rs.getString("vinculacao");

                // Faça algo com os dados recuperados
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Senha: " + senha);
                System.out.println("Endereço de Email: " + enderecoEmail);
                System.out.println("Vinculacao: "+ vinculacao);
            }
            // Fechar recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
