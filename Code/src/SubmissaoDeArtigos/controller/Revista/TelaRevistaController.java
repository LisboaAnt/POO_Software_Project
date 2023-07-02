package SubmissaoDeArtigos.controller.Revista;

import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.view.TelaRevista;

/**
 *
 * @author mcair
 */
public class TelaRevistaController implements Observer {
    
    private Model model; //Guarda o MODEL GERAL!!
    private TelaRevista view; //Guarda a sua view
    

    
    public String cadastrarRevisor(String nome,String senha,String email,String especialidade){
    
        
        if(nome.length() !=0 && senha.length() != 0 && email.length() !=0 && especialidade.length() != 0){
        Revisor revisor = new Revisor(nome,senha,email,especialidade);
        
        DAO dao = DAO.getInstance();
        dao.databaseInsert(revisor);
        return "Deu certo";
        }else{return "DADOS INVALIDOS";}
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
