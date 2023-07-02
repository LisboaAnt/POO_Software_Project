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
    private int id;
    private String titulo;
    private Revisor[] revisores;
    private String resumo;
    private File conteudo;
    private Revisor statusDeRevisao;
    private Date dataDeSubmissao;
    private Date dataDePublicacao;


    public Artigo(){

    }
    public Artigo(String titulo, Revisor[] revisores, String resumo, File conteudo, Revisor statusDeRevisao, Date dataDeSubmissao, Date dataDePublicacao){
        this.titulo = titulo;
        this.revisores = revisores;
        this.resumo = resumo;
        this.conteudo = conteudo;
        this.statusDeRevisao = statusDeRevisao;
        this.dataDeSubmissao = dataDeSubmissao;
        this.dataDePublicacao = dataDePublicacao;
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
    public File getConteudo(){
        return conteudo;
    }
    public void setConteudo(File conteudo){
        this.conteudo = conteudo;
    }
    public Revisor getStatusDeRevisao(){
        return statusDeRevisao;
    }
    public void setStatusDeRevisao(Revisor statusDeRevisao){
        this.statusDeRevisao = statusDeRevisao;
    }
    public Date getDataDeSubmissao(){
        return dataDeSubmissao;
    }
    public void setDataDeSubmissao(Date dataDeSubmissao){
        this.dataDeSubmissao = dataDeSubmissao;
    }
    public Date getDataDePublicacao(){
        return dataDePublicacao;
    }
    public void setDataDePublicacao(Date dataDePublicacao){
        this.dataDePublicacao = dataDePublicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
