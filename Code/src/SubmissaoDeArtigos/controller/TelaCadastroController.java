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
        
        Pessoa pessoa = dao.verificarLoginPessoa(email, senha);    
        if(pessoa != null){

            if(pessoa.getVinculacao().equals("Autor")){
                
                AutorView view = new AutorView();
                view.initAutorView(model);
                view.setVisible(true);
            }
        }else{
            
            return "Valores invalidos";
            
        }      
        return "Valores invalidos";
    }
    
   public String cadastro(String nome, String email, String senha,String tipo){
    
       if(email.length() ==0 || senha.length() == 0 || tipo == "..."){
        return "VALORES IVALIDOS";
        }
       
       
       if(tipo == "Autor"){
       Autor autor = new Autor(nome,email,senha,tipo);
       dao.databaseInset(autor);
       return "ADICIONADO COM SUCESSO";
       }
           
       if(tipo == "Revista"){
       Pessoa pessoa = new Pessoa(nome,email,senha,tipo);
       dao.databaseInsert(pessoa);
       return "ADICIONADO COM SUCESSO";
       }
       
       if(tipo == "Revisor"){
       return "Só revista pode cadastrar Revisor";
       }

    return "";
   }
    
    
    
    public void update() {//Observer
    }
    
    
}
