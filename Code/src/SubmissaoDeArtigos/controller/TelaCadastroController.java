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
            if(autor != null){return ("Nome :"+autor.getNome()+ " Id :"+autor.getId());}
        }
        
        if(tipo == "Revista"){
        Pessoa pessoa = dao.verificarLoginPessoa(email, senha);
        if(pessoa !=null){return ("Nome :"+pessoa.getNome()+ " Id :"+pessoa.getId());}
        
        return "NÃO ENCONTRADO";
        }
        
        if(tipo == "Revisor"){
        //Revisor revisor = dao.verificarLoginRevisor(email, senha);
                Revisor revisor = dao.verificarLoginRevisor(email, senha);
        if(revisor !=null){return ("Nome :"+revisor.getNome()+ " Id :"+revisor.getId());}
        return "NÃO ENCONTRADO";
        }
        
        return "VALORES IVALIDOS";
        

            
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
