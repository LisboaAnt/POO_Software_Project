package SubmissaoDeArtigos.controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProgramaFechador extends WindowAdapter {//Toda vez que o programa fecha vai ser acionado
    
    @Override
    public void windowClosing(WindowEvent e) {
        // Aqui voc� pode realizar qualquer a��o necess�ria antes de encerrar o programa
        // Por exemplo, salvar dados, fechar conex�es, etc.
        
        // Encerra o programa
        System.exit(0);
    }
}
