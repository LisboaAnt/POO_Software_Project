/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.model;
import java.io.File;
import java.sql.Date;

/**
 *
 * @author Francisco Levi Souza Anastácio
 */
public class Artigo {
    private String titulo;
    private Revisor[] revisores;
    private String resumo;
    private String conteudo;
    private Boolean statusDeRevisao;


    public Artigo(){

    }
    public Artigo(String titulo, Revisor[] revisores, String resumo, String conteudo, Boolean statusDeRevisao){
        this.titulo = titulo;
        this.revisores = revisores;
        this.resumo = resumo;
        this.conteudo = conteudo;
        this.statusDeRevisao = statusDeRevisao;
    }
    
    public Artigo(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
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
    public String getResumo(){
        return resumo;
    }
    public void setResumo(String resumo){
        this.resumo = resumo;
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
