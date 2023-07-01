
package SubmissaoDeArtigos.model;


public class Pessoa {
    private int id;
    private String nome;
    private String enderecoEmail;
    private String senha;
    private String vinculacao;
    

    public Pessoa(String nome, String enderecoEmail, String senha, String vinculacao) {
    this.nome = nome;
    this.enderecoEmail = enderecoEmail;
    this.senha = senha;
    this.vinculacao = vinculacao;
}

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getVinculacao() {
        return vinculacao;
    }

    public void setVinculacao(String vinculacao) {
        this.vinculacao = vinculacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", enderecoEmail=" + enderecoEmail + ", senha=" + senha + ", vinculacao=" + vinculacao + '}';
    }
    
}
    