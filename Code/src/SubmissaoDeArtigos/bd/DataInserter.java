/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.bd;
import SubmissaoDeArtigos.model.*;
import java.sql.*;

public class DataInserter {
    private Connection conn;

    public DataInserter() {
        try {
            conn = DriverManager.getConnection("jdbc:derby:banco");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertPessoa(Pessoa pessoa) {

        String sql = "INSERT INTO Pessoa (nome, senha, enderecoEmail, vinculacao ) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
        statement.setString(1, pessoa.getNome());
        statement.setString(2, pessoa.getSenha());
        statement.setString(3, pessoa.getEnderecoEmail());
        statement.setString(4, pessoa.getVinculacao());
        statement.executeUpdate();
        statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    
    //
 

    // Métodos para inserir dados nas outras tabelas

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
