package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class TelaCadastroController implements Observer {
    DAO dao = DAO.getInstance();
    private Model model; //Guarda o MODEL GERAL!!
    private TelaCadastro view; //Guarda a sua view
    

    public void initTelaCadastroController(Model model, TelaCadastro view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a view
                model.attachObserver(this);
	}
    
    
    
    
    public String login(String email,String senha, String tipo){
        
        if(email.length() ==0 || senha.length() == 0 || tipo == "..."){
        return "VALORES IVALIDOS";
        }
        if(tipo == "Autor"){
        Autor autor = dao.verificarLoginAutor(email, senha);
        if(autor == null){return "NÃO ENCONTRADO";}
       
        }
        
        if(tipo == "Revista"){
        Pessoa pessoa = dao.verificarLogin(email, senha);
        
        return "NÃO ENCONTRADO";
        }
        
        if(tipo == "Revisor"){
        Revisor revisor = dao.verificarLoginRevisor(email, senha);
        
        return "NÃO ENCONTRADO";
        }
        
        return "VALORES IVALIDOS";
        

            
}
    
   public String cadastro(String nome, String email, String senha,String tipo){
    
       if(tipo == "Autor"){
       Autor autor = new Autor(nome,email,senha,tipo);
       dao.(autor);
       
       }
           
           
    Pessoa pessoa = new Pessoa(nome,email,senha,tipo);
    
    dao.databaseInsert(pessoa);
       
    return "ADICIONADO COM SUSESSO";
   }
    
    
    
    public void update() {//Observer
    }
    
    
}
