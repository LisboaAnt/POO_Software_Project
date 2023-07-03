/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.model.Model;
import SubmissaoDeArtigos.view.*;

/**
 *
 * @author Windows 10
 */
public class SubmissaoController implements Observer{

    private Model model;
    private submissaoView view;
    
    public void initSubmissaoController(Model model, submissaoView view){
        this.model = model;  // Guarda o modelo
        this.view = view;	 // Guarda a view
        model.attachObserver(this);
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
