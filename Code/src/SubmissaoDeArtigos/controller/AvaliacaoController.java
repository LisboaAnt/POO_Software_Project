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
    
    
}
