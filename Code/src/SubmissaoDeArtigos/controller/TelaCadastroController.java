package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class TelaCadastroController implements Observer {
    DAO dao = DAO.getInstance();
    private Model model; //Guarda o MODEL GERAL!!
    private TelaCadastro view; //Guarda a sua view
    
public void update() {//Implementado do Observer
    }
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
            if(autor != null){
            view.setVisible(false);
            AutorView view1 = new AutorView();
            view1.initAutorView(model);
            }
            return "NAO ENCONTRADO";
        }
        
        if(tipo == "Revista"){
        Pessoa pessoa = dao.verificarLoginPessoa(email, senha);
        if(pessoa !=null){
        view.setVisible(false);
        TelaRevista view1 = new TelaRevista(); // Depois cria-se a primeira view
        view1.initTelaRevista(model);
        
        }
        
        return "NAO ENCONTRADO";
        }
        
        if(tipo == "Revisor"){
        //Revisor revisor = dao.verificarLoginRevisor(email, senha);
                Revisor revisor = dao.verificarLoginRevisor(email, senha);
        if(revisor !=null){
        view.setVisible(false);
        RevisorView view1 = new RevisorView();
        view1.initRevisorView(model);
        }
        return "NAO ENCONTRADO";
        }
        
        return "VALORES IVALIDOS";
        

            
}
    
   public String cadastro(String nome, String email, String senha,String tipo){
    
       if(email.length() ==0 || senha.length() == 0 || tipo == "..."){
        return "NAO ENCONTRADO";
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
    
}
