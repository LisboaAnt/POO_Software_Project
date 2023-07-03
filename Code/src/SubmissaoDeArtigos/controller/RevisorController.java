package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class RevisorController implements Observer{
     Model model;
     RevisorView view;
    
    public void InitUserViewRevisorController(Model model, RevisorView view){
        this.model = model;
        this.view = view;
        model.attachObserver(this);
    }
    
    @Override
    public void update(){
    }
    
    public void alternarTelaAva(Model model){
        AvaliacaoView viewAvaliar = new AvaliacaoView();
        viewAvaliar.initAvaliacaoView(model,null,null);
        viewAvaliar.setVisible(true);
        this.view.setVisible(false);
    }
}


