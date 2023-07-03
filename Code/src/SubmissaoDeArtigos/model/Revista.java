/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.model;

public class Revista {
    private int id;
    private String nome;
    private int editorChefeId;
    private int ISSN;

    public Revista(String nome, int editorChefeId, int ISSN) {
        this.nome = nome;
        this.editorChefeId = editorChefeId;
        this.ISSN = ISSN;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEditorChefeId() {
        return editorChefeId;
    }

    public void setEditorChefeId(int editorChefeId) {
        this.editorChefeId = editorChefeId;
    }

    public int getISSN() {
        return ISSN;
    }

    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }
}
