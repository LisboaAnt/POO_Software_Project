/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.model;
import java.util.*;

public class Revisor extends Pessoa {
    private String especialidade;
    private List<Artigo> listaDeRevisoes;
    // Outros atributos e métodos
    
    // Construtores, getters e setters

    public Revisor( String nome, String enderecoEmail, String senha) {
        super( nome, enderecoEmail, senha,"Revisor");
    }
    
    
    
}
