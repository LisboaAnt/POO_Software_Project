/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.model.*;

public class verSubmissaoController implements Observer {
    private Model model;
    private verSubmissaoView view;
    private Autor autor;
    private AutorView viewant;
    
    public void initVerSubController(Model model, verSubmissaoView view){
        this.model = model;  // Guarda o modelo
        this.view = view;	 // Guarda a view
        model.attachObserver(this);
    }
    
    public void verArtigoSubmetido(){
        verArtSubmView view1 = new verArtSubmView();
        view1.initVerArtSubmView(model, view);
        view1.setVisible(true);
        view.setVisible(false);
    }
    
    public void verAva(){
        ArtigosAvaView view1 = new ArtigosAvaView();
        view1.initArtigosAvaView(model, view);
        view1.setVisible(true);
        view.setVisible(false);
    }
    
    public void update() {//Observer
        
    }
    
    
    
}
