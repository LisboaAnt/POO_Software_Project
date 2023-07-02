package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class AvaliacaoController implements Observer{
    private Model model;
    private AvaliacaoView view;
    
    public void initUserViewAvaliacaoController(Model model, AvaliacaoView view){
        this.model = model;
        this.view = view;
        model.attachObserver(this);
    }
    
    
    public void update(){
    }
    public void prox(){
        AvaliacaoView view = new AvaliacaoView();
        view.initAvaliacaoView(model,this.view, this.view);
        view.setVisible(true);
        this.view.setVisible(false);
    }
    public void ant(){
         AvaliacaoView view = new AvaliacaoView();
         view.initAvaliacaoView(model,this.view, this.view);
         view.setVisible(true);
         this.view.setVisible(false);
        
    }
}
