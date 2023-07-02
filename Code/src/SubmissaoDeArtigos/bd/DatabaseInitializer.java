
package SubmissaoDeArtigos.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initializeDatabase() {
        Connection conn = null;
        try {
            // Estabelecer a conexão com o banco de dados
            conn = DriverManager.getConnection("jdbc:derby:banco;create=true");

            // Criar tabelas
            Statement stmt = conn.createStatement();
            
            stmt.execute("CREATE TABLE Pessoa (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "nome VARCHAR(255) NOT NULL," +
                    "senha VARCHAR(255) NOT NULL," +
                    "enderecoEmail VARCHAR(255)," +
                    "vinculacao VARCHAR(255)," +
                    "PRIMARY KEY (id))");

            stmt.execute("CREATE TABLE Artigo (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "titulo VARCHAR(255) NOT NULL," +
                    "resumo CLOB," +
                    "conteudo BLOB," +
                    "statusDeRevisao INT," +
                    "dataDeSubmissao DATE," +
                    "dataDePublicacao DATE," +
                    "PRIMARY KEY (id))");



            stmt.execute("CREATE TABLE Autor (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "nome VARCHAR(255) NOT NULL," +
                    "senha VARCHAR(255)," +
                    "enderecoEmail VARCHAR(255)," +
                    "artigos VARCHAR(1000) NOT NULL," +  // Adicionei uma vírgula aqui
                    "vinculacao VARCHAR(255)," +
                    "historicoDePublicacoes VARCHAR(1000) NOT NULL," +  // Adicionei uma vírgula aqui
                    "PRIMARY KEY (id))");

            stmt.execute("CREATE TABLE Revisor (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "nome VARCHAR(255) NOT NULL," +
                    "senha VARCHAR(255) NOT NULL," +
                    "enderecoEmail VARCHAR(255)," +
                    "especialidade VARCHAR(255) NOT NULL," +
                    "PRIMARY KEY (id))");
            
            stmt.execute("CREATE TABLE Edicao (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "titulo VARCHAR(255) NOT NULL," +
                    "numero VARCHAR(255) NOT NULL," +
                    "trilha VARCHAR(255),");

            stmt.execute("CREATE TABLE Artigo_Autor (" +
                    "artigo_id INT," +
                    "autor_id INT," +
                    "FOREIGN KEY (artigo_id) REFERENCES Artigo(id)," +
                    "FOREIGN KEY (autor_id) REFERENCES Autor(id))");

            stmt.execute("CREATE TABLE Revisao (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "revisor_id INT," +
                    "artigo_id INT," +
                    "estatus BOOLEAN," +
                    "PRIMARY KEY (id)," +
                    "FOREIGN KEY (revisor_id) REFERENCES Revisor(id)," +
                    "FOREIGN KEY (artigo_id) REFERENCES Artigo(id))");

            stmt.execute("CREATE TABLE Revista (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "nome VARCHAR(255) NOT NULL," +
                    "editorChefe_id INT," +
                    "ISSN INT," +
                    "PRIMARY KEY (id)," +
                    "FOREIGN KEY (editorChefe_id) REFERENCES Pessoa(id))");

            stmt.execute("CREATE TABLE Submissao (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "artigo_id INT," +
                    "instituicao_id INT," +
                    "status VARCHAR(255)," +
                    "PRIMARY KEY (id)," +
                    "FOREIGN KEY (artigo_id) REFERENCES Artigo(id)," +
                    "FOREIGN KEY (instituicao_id) REFERENCES Revista(id))");

            stmt.execute("CREATE TABLE Edicao (" +
                    "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                    "local_id INT," +
                    "numEdicao VARCHAR(255)," +
                    "PRIMARY KEY (id)," +
                    "FOREIGN KEY (local_id) REFERENCES Revista(id))");

            // Fechar recursos
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


