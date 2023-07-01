package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;


public class MainViewController implements Observer{
	private Model model;	// Guarda o modelo a ser utilizado
	private MainView view;	// Guarda a view a ser controlada
	

	public void initMainViewController(Model model, MainView view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a view
                model.attachObserver(this);
	}
	
        public void initTelaCadastro(){
            TelaCadastro view2 = new TelaCadastro(); // ir para tela de cadastro de usuário
            view2.initTelaCadastro(model);
        }
        
        public void initRevisor(){
            RevisorView view3 = new RevisorView(); // ir para a tela revisor
            view3.initRevisorView(model);
        }
        
        public void initAvaliacao(){
            AvaliacaofinalView view4 = new AvaliacaofinalView();
            view4.initAvaliacaofinalView(model);
            
        }
        

	public void update() {
		
	}

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }


	
}
