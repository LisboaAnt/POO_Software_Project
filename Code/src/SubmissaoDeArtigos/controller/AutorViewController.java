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
    
    public void NovoArtigo(Autor autor){
        CadArtigoView view = new CadArtigoView();
        view.initCadArtigoView(model, this.view, autor);
        view.setVisible(true);
        this.view.setVisible(false);
    }
    
    public void IrParaSubmissao(){
        verSubmissaoView view = new verSubmissaoView();
        view.initVerSubView(model, this.view);
        view.setVisible(true);
        this.view.setVisible(false);      
    }
    
    public void IrParaArtigo(){
        verArtigoView view = new verArtigoView();
        view.initVerArtigoView(model, this.view);
        view.setVisible(true);
        this.view.setVisible(false);      
    }    
    
    public void update() {//Implementado do Observer
    }
    
    
}
