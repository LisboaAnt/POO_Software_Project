/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.model;

/**
 *
 * @author Francisco Levi Souza Anastácio
 */
public class Artigo {
    private int id;
    private String titulo;
    private Revisor[] revisores;
    private String conteudo;
    private Boolean statusDeRevisao;


    public Artigo(){

    }
    public Artigo(String titulo, Revisor[] revisores, String conteudo, Boolean statusDeRevisao){
        this.titulo = titulo;
        this.revisores = revisores;
       
        this.conteudo = conteudo;
        this.statusDeRevisao = statusDeRevisao;
    }
    
    public Artigo(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public Revisor[] getRevisores(){
        return revisores;
    }
    public void setRevisores(Revisor[] revisores){
        this.revisores = revisores;
    }
    
    public String getConteudo(){
        return conteudo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    public Boolean getStatusDeRevisao(){
        return statusDeRevisao;
    }
    public void setStatusDeRevisao(Boolean statusDeRevisao){
        this.statusDeRevisao = statusDeRevisao;
    }
}
