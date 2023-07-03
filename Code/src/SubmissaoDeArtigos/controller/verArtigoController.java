/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.model.Model;
import SubmissaoDeArtigos.view.Observer;
import SubmissaoDeArtigos.view.submissaoView;
import SubmissaoDeArtigos.view.verArtigoView;

/**
 *
 * @author Windows 10
 */
public class verArtigoController implements Observer{
    private Model model;
    private verArtigoView view;
    
    public void initVerArtigoController(Model model, verArtigoView view){
        this.model = model;  // Guarda o modelo
        this.view = view;	 // Guarda a view
        model.attachObserver(this);
    }
    
    public void SubmeterArtigo(){
        submissaoView view1 = new submissaoView();
        view1.initSubmissaoView(model, view);
        view1.setVisible(true);
        view.setVisible(false);
    }

    public void update() {}   
}
