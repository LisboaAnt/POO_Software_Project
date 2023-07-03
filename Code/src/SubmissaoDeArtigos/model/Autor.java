
package SubmissaoDeArtigos.model;
import java.util.*;

public class Autor extends Pessoa {
    private ArrayList<Artigo> artigos;
    private String vinculacao;
    private ArrayList<Artigo> historicoDePublicacoes;

    public Autor( String nome, String enderecoEmail, String senha,String vinculacao) {
        super( nome, enderecoEmail, senha,"Autor");
        this.vinculacao = vinculacao;
    }

    

    public void cadastrarAutor(Autor autor){
        
    }

    public void editarArtigo() {
        // Lï¿½gica para editar o artigo
        System.out.println("Artigo editado com sucesso!");
    }

    public void enviarCorrecao() {
        // Lï¿½gica para enviar correï¿½ï¿½o do artigo
        System.out.println("Correï¿½ï¿½o enviada com sucesso!");
    }

    public void submeteArtigo() {
        // Lï¿½gica para submeter o artigo
        System.out.println("Artigo submetido com sucesso!");
    }

    // Getters e setters

    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(ArrayList<Artigo> artigos) {
        this.artigos = artigos;
    }

    public String getVinculacao() {
        return vinculacao;
    }

    public void setVinculacao(String vinculacao) {
        this.vinculacao = vinculacao;
    }

    public ArrayList<Artigo> getHistoricoDePublicacoes() {
        return historicoDePublicacoes;
    }

    public void setHistoricoDePublicacoes(ArrayList<Artigo> historicoDePublicacoes) {
        this.historicoDePublicacoes = historicoDePublicacoes;
    }
    
    //
    public String getHistoricoDePublicacoesIds() {;
    StringBuilder sb = new StringBuilder();
    for (Artigo artigo : historicoDePublicacoes) {
        sb.append(artigo.getId()).append(",");
    }
    if (sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1); // Remove the last comma
    }
    return sb.toString();
}
    
    
    //
    public String getArtigosIds() {
        if (artigos == null) {
            return ""; // Retorna uma string vazia se a lista de artigos for nula
        }

        StringBuilder sb = new StringBuilder();
        for (Artigo artigo : artigos) {
            sb.append(artigo.getId()).append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1); // Remove a última vírgula
        }
        return sb.toString();
    }

    public String getHPIds() {
        if (historicoDePublicacoes == null) {
            return ""; // Retorna uma string vazia se o histórico de publicações for nulo
        }

        StringBuilder sb = new StringBuilder();
        for (Artigo artigo : historicoDePublicacoes) {
            sb.append(artigo.getId()).append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1); // Remove a última vírgula
        }
        return sb.toString();
    }
}

