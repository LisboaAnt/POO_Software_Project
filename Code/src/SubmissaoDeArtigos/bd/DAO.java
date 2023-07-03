
package SubmissaoDeArtigos.bd;
import SubmissaoDeArtigos.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static DAO instance;
    Datadelete ext = new Datadelete("jdbc:derby:banco"); //cria o objeto delete
    


    //SÓ PODE GERAR UM OBJETO DO "DAO"
    private DAO() {
    }
    public static DAO getInstance() {
            if ( instance == null) {
                instance = new DAO();
            }
        return instance;
        }
    
    
    //CRIA TODOS OS ARQUIVOS DO BANCO
    public void DatabaseInitializer(){
    DatabaseInitializer.initializeDatabase(); }
    
    
    public void databaseInset(Revisor revisor){
        DataInserter add = new DataInserter(); 
        add.insertRevisor(revisor);
    }
    
    public void databaseInset(Edicao edicao){
        DataInserter add = new DataInserter(); 
        add.insertEdicao(edicao);
    }
    
    public void databaseInset(Autor autor){
        DataInserter add = new DataInserter(); 
        add.insertAutor(autor);
    }
    
    
    public void databaseInsert(Pessoa pessoa){
        DataInserter add = new DataInserter(); // cria o objeto insert
        
        add.insertPessoa(pessoa); // adiciona no banco
        
    }
    
    
    
    
    //APAGA TODOS OS DADOS DA TABELA
    public void DatabaseDelete(String tabela, int id){
    ext.excluirRegistro(tabela, id);
    }
    
    public void DatabaseDelete(String tabela){
        ext.excluirTodosRegistros(tabela);
    }

    //
    
    public Revisor verificarLoginRevisor(String email, String senha) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:banco");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Autor WHERE enderecoEmail = ? AND senha = ?");
            statement.setString(1, email);
            statement.setString(2, senha);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String enderecoEmail = resultSet.getString("enderecoEmail");
                String senha1 = resultSet.getString("senha");
                String especialidade1 = resultSet.getString("especialidade");
                Revisor revisor = new Revisor( nome, enderecoEmail,senha1, especialidade1);
                revisor.setId(id);
                resultSet.close();
                statement.close();
                conn.close();
                return revisor;
            } else {
                resultSet.close();
                statement.close();
                conn.close();
                return null; // Login inválido, nenhum registro encontrado
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao verificar o login no banco de dados: " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    //
public Autor verificarLoginAutor(String email, String senha) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:banco");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Autor WHERE enderecoEmail = ? AND senha = ?");
            statement.setString(1, email);
            statement.setString(2, senha);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String enderecoEmail = resultSet.getString("enderecoEmail");
                String senha1 = resultSet.getString("senha");
                String artigos = resultSet.getString("artigos");
                String vinculacao = resultSet.getString("vinculacao");
                String publicaocoes = resultSet.getString("historicoDePublicacoes");
                Autor autor = new Autor( nome, enderecoEmail,senha1, vinculacao);
                autor.setId(id);
                resultSet.close();
                statement.close();
                conn.close();
                return autor;
            } else {
                resultSet.close();
                statement.close();
                conn.close();
                return null; // Login inválido, nenhum registro encontrado
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao verificar o login no banco de dados: " + e.getMessage());
        }
    }
    
    //Verificar login
    public Pessoa verificarLoginPessoa(String email, String senha) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:banco");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Pessoa WHERE enderecoEmail = ? AND senha = ?");
            statement.setString(1, email);
            statement.setString(2, senha);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String enderecoEmail = resultSet.getString("enderecoEmail");
                String senha1 = resultSet.getString("senha");
                String vinculacao = resultSet.getString("vinculacao");
                Pessoa pessoa = new Pessoa( nome, enderecoEmail,senha1, vinculacao);
                pessoa.setId(id);
                resultSet.close();
                statement.close();
                conn.close();
                return pessoa;
            } else {
                resultSet.close();
                statement.close();
                conn.close();
                return null; // Login inválido, nenhum registro encontrado
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao verificar o login no banco de dados: " + e.getMessage());
        }
    }

    
    
    
    
    
    //PRINTA TODAS AS PESSOAS
    public void printPessoas(){
        List<Pessoa> pessoas = this.obterTodasAsPessoas(); //passa para uma lista de pessoas

        for (Pessoa pessoa : pessoas) { //Printa todas as pessoas
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Senha: " + pessoa.getSenha());
            System.out.println("Endereço de Email: " + pessoa.getEnderecoEmail());
            System.out.println("Vinculacao: " + pessoa.getEnderecoEmail());
            
            System.out.println("--------------------");
        }
    }
    
    
    
    
    //RETURN
    //RETORNA UMA LISTA DE PESSOAS
    public List<Pessoa> obterTodasAsPessoas() {
    List<Pessoa> pessoas = new ArrayList<>();

    try (Connection conn = DriverManager.getConnection("jdbc:derby:banco");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM Pessoa")) {

        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String senha = rs.getString("senha");
            String enderecoEmail = rs.getString("enderecoEmail");
            String vinculacao = rs.getString("vinculacao");
            Pessoa pessoa = new Pessoa( nome, senha, enderecoEmail, vinculacao);
            pessoas.add(pessoa);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return pessoas;
    }
 

    
// Só essa classe vai ser executada,     
}
