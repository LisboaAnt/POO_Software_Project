
package SubmissaoDeArtigos.model;
import java.util.*;

public class Autor {
    private ArrayList<Artigo> artigos;
    private String vinculacao;
    private ArrayList<Artigo> historicoDePublicacoes;

    public Autor() {
        artigos = new ArrayList<>();
        historicoDePublicacoes = new ArrayList<>();
    }

    public void editarArtigo() {
        // L�gica para editar o artigo
        System.out.println("Artigo editado com sucesso!");
    }

    public void enviarCorrecao() {
        // L�gica para enviar corre��o do artigo
        System.out.println("Corre��o enviada com sucesso!");
    }

    public void submeteArtigo() {
        // L�gica para submeter o artigo
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
}

