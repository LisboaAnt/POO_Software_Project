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

        public static void insertRevisor(Revisor revisor){
        String sql = "INSERT INTO Revirsor (nome, senha, enderecoEmail,especialidade) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:banco");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, revisor.getNome());
            stmt.setString(2, revisor.getSenha());
            stmt.setString(3, revisor.getEnderecoEmail());
            stmt.setString(4, revisor.getEspecialidade());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static void insertEdicao(Edicao edicao){
        String sql = "INSERT INTO Edicao (Titulo, Numero,Trilha) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:banco");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, edicao.getTitulo());
            stmt.setString(2, edicao.getNumero());
            stmt.setString(3, edicao.getTrilha());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
        
        
    
    
    
    
        public static void insertAutor(Autor autor) {
            String sql = "INSERT INTO Autor (nome, senha, enderecoEmail,artigos, vinculacao,historicoDePublicacoes ) VALUES (?, ?, ?, ?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:derby:banco");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getSenha());
            stmt.setString(3, autor.getEnderecoEmail());
            stmt.setString(4, autor.getArtigosIds());
            stmt.setString(5, autor.getVinculacao());
            stmt.setString(6, autor.getHistoricoDePublicacoesIds());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Autor inserted successfully!");
            } else {
                System.out.println("Failed to insert autor.");
            }
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
