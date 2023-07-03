/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.model.Model;
import SubmissaoDeArtigos.view.*;

public class EditarArtigoController implements Observer{
    private Model model;
    private editarArtigoView view;
    
    public void update() {}
    
    public void initEditarArtigoController(Model model, editarArtigoView view){
        this.model = model;
        this.view = view;
        model.attachObserver(this);
    }
}
