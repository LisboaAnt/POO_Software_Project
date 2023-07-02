package SubmissaoDeArtigos;


import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.controller.*;
import SubmissaoDeArtigos.view.TelaRevista;



public class main { //poe o derby na libraries na classpath


    public static void main(String[] args) {
        
        Model model = new Model(); // Primeiro instancia-se o modelo
        

        TelaRevista view = new TelaRevista();
        //MainView view = new MainView(); // Depois cria-se a primeira view
        view.initTelaRevista(model); // Por fim, inicializa a view passando o modelo
        RevisorView view2 = new RevisorView();
        view2.initRevisorView(model);

        //TelaRevista view = new TelaRevista();
         //MainView view = new MainView(); // Depois cria-se a primeira view
         //view.initMainView(model);
        //view.initTelaRevista(model); // Por fim, inicializa a view passando o modelo
        //RevisorView view2 = new RevisorView();
        //view2.initRevisorView(model);

            
        DAO dao = DAO.getInstance();
        //dao.DatabaseInitializer();

        //Pessoa a = new Pessoa("Luis","lis.gmail", "1235", "Autor");
        //dao.databaseInsert(a);
        
        
        /* BUSCAR LOGIN
        DatabaseGetter.getDataFromDatabase();
        Pessoa aa = dao.verificarLogin("lis.gmail", "1235");
        if(aa != null){System.out.println(aa.toString());
        }
        */
       
        dao.obterTodasAsPessoas();
        //RevisorView viewRevisor = new RevisorView();
        //viewRevisor.initRevisorView(model);
        // Configura o ProgramaFechador como o listener para o evento de fechamento da janela principal


             
    }
}
