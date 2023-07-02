/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.view.Observer;

public class CadArtigoController implements Observer {
    private Model model;
    private CadArtigoView view;
    private Autor autor;
    private AutorView viewant;
    
    public void initArtigoViewController(Model model, CadArtigoView view){
        this.model = model;  // Guarda o modelo
        this.view = view;	 // Guarda a view
        model.attachObserver(this);
    }
    
    public void SalvarNovoArtigo(String titulo, String conteudo, Autor autor, AutorView viewant){
        //colocar no banco de dados na array do autor para artigos - lisboa
        this.autor = autor;
      
        Artigo artigo = new Artigo(titulo,conteudo);
        String x = "foi";
        System.out.printf(x);
        view.setVisible(false);
        viewant.setVisible(true);
        
        
    }
    
    public void update() {//Observer
        
    }
}
