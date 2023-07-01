package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class AvaliacaofinalController implements Observer {
    private Model model;
    private AvaliacaofinalView view;
    
    public void initUserViewAvaliacaofinalController(Model model, AvaliacaofinalView view){
        this.model = model;
        this.view = view;
        model.attachObserver(this);
    }
    
    @Override
    public void update(){
    }
}

