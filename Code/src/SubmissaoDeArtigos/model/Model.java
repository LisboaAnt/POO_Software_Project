
package SubmissaoDeArtigos.model;

import java.util.ArrayList;
import java.util.HashMap;
import SubmissaoDeArtigos.view.Observer;


public class Model {
    public int x = 10;
        
    private ArrayList<Observer> observers = new ArrayList<Observer>(); // Lista de observadores interessados no modelo

        /*
         * Método utilizado para notificar todos os observadores contidos no ArrayList que o modelo mudou
         */
    public void notifica() {
            for (Observer o : observers) {
                    o.update(); // update é a operação definida na interface Observer
            }
    }

        
    public void alteranomedoUser(String x){

    }
        /*
	 * Registra um observador na lista de observadores
	 */
    public void attachObserver(Observer observer) {
            if (observer != null) {
                    observers.add(observer);
            }		
    }
	
	/*
	 * Exclui um observador da lista de observadores
	 */
    public void detachObserver(Observer observer) {
            if (observer != null) {
                    observers.remove(observer);
            }
    }
	
}
