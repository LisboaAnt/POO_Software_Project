/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.CadArtigoView;
import SubmissaoDeArtigos.view.Observer;

public class CadArtigoController implements Observer {
    private Model model;
    private CadArtigoView view;
    
    public void initArtigoViewController(Model model, CadArtigoView view){
        this.model = model;  // Guarda o modelo
        this.view = view;	 // Guarda a view
        model.attachObserver(this);
    }
    
    public void update() {//Observer
        
    }
}
