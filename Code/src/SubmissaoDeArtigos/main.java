package SubmissaoDeArtigos;


import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.controller.*;
import SubmissaoDeArtigos.view.TelaRevista;



public class main { //poe o derby na libraries na classpath


    public static void main(String[] args) {
        
        Model model = new Model(); // Primeiro instancia-se o modelo
        MainView view = new MainView(); // Depois cria-se a primeira view
<<<<<<< HEAD
        view.initMainView(model);
=======
        view.initMainView(model); //passa a model para criar sua controladora
        
>>>>>>> 101c0834552565fcff7a1bdb1c5b283d2931690b

            
        DAO dao = DAO.getInstance();
        //Revisor r = new Revisor("Nome","email","senha","especialidade");
        //dao.databaseInset(r); //insere o revisor
        //dao.DatabaseInitializer(); //Cria a pasta do banco

        //Pessoa a = new Pessoa("Luis","lis.gmail", "1235", "Autor"); //cria pessoa
        //dao.databaseInsert(a);//insere pessoa
             
    }
}
