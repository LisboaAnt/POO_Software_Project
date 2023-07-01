package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class TelaCadastroController implements Observer {
    private Model model; //Guarda o MODEL GERAL!!
    private TelaCadastro view; //Guarda a sua view
    

    public void initTelaCadastroController(Model model, TelaCadastro view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a view
                model.attachObserver(this);
	}
    
    
    
    
    public String login(String email,String senha){
        DAO dao = DAO.getInstance();
        
        Pessoa pessoa = dao.verificarLogin(email, senha);    
        if(pessoa != null){

            if(pessoa.getVinculacao().equals("Autor")){
                
                AutorView view = new AutorView();
                view.initAutorView(model);
            
            
            }
        }else{
            
            return "Valores invalidos";
            
        }
        
        return "";
    }
    
   
  
    
    
    
    
    public void update() {//Observer
    }
    
    
}
