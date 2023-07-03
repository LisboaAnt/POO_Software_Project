package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class ArtigosAvaController implements Observer {
    private Model model;
    private ArtigosAvaView view;
    
    public void initArtigosAvaController(Model model, ArtigosAvaView view){
        this.model = model;
        this.view = view;
        model.attachObserver(this);
    }
    
    public void update(){
    }
}
