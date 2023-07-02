package SubmissaoDeArtigos.controller.Revista;

import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.view.Revista.TelaRevista;

/**
 *
 * @author mcair
 */
public class TelaRevistaController implements Observer {
    
    private Model model; //Guarda o MODEL GERAL!!
    private TelaRevista view; //Guarda a sua view
    

    
    public void cadastrarRevisor(Revisor revisor){
    
        DAO dao = DAO.getInstance();
        dao.databaseInsert(revisor);
    
    }
    
    
    
    public void initTelaRevistaController(Model model, TelaRevista view) {
        this.model = model;  // Guarda o modelo
        this.view = view;	 // Guarda a view
        model.attachObserver(this);
    }
    
    @Override
    public void update() {//Observer
        
    }
    
}
