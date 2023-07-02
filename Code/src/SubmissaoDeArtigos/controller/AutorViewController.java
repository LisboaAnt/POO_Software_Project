package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.model.*;

public class AutorViewController implements Observer {
    private Model model; //Guarda o MODEL GERAL!!
    private AutorView view; //Guarda a sua view
    

    public void initAutorViewController(Model model, AutorView view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a view
                model.attachObserver(this);
    }
    
    public void NovoArtigo(){
        CadArtigoView view = new CadArtigoView();
        view.initCadArtigoView(model);
        view.setVisible(true);
        this.view.setVisible(false);
    }
    
    
    
    public void update() {//Implementado do Observer
    }
    
    
}
