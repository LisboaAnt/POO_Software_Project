package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;
import java.util.ArrayList;

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
        ArrayList <String> listaCriterios = new ArrayList<>(); 
        listaCriterios.add("Estruturação");
        listaCriterios.add("Ortografia");
        listaCriterios.add("Concordancia");
        listaCriterios.add("Referências");
        listaCriterios.add("Conclusão");
        AvaliacaoView view = new AvaliacaoView();
        AvaliacaofinalView view2 = new AvaliacaofinalView();
        for(int i = 0; i<listaCriterios.size(); i++){
            if(i < listaCriterios.size()-1){
                view.initAvaliacaoView(model,this.view, this.view);
                view.setVisible(true);
                this.view.setVisible(false);
            }else if(i == listaCriterios.size()-1){
                view2.initAvaliacaofinalView(model);
                view2.setVisible(true);
                this.view.setVisible(false);
                
            
            }
        }
    }
}
