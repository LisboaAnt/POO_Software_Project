/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.model.*;
        
public class verArtSubmController implements Observer{
    private Model model;
    private verArtSubmView view;
    private verSubmissaoView viewant;
    
    public void initVerArtSubmController(Model model,verArtSubmView view){
        this.model = model;
        this.view = view;
        model.attachObserver(this);
    }
    
    public void editarArtigo(){
        editarArtigoView view1 = new editarArtigoView();
        view1.initEditarArtigo(model, view);
        view1.setVisible(true);
        view.setVisible(false);
    }

    @Override
    public void update() {}
    
    
}
