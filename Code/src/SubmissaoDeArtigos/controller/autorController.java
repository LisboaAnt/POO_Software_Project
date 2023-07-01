/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.view.autorView;
import SubmissaoDeArtigos.model.Autor;

/**
 *
 * @author Windows 10
 */
public class autorController {
        private Autor model;
        private autorView tela;
    
    
     public void initautorController(Autor model, autorView tela){
          this.model = model;
          this.tela = tela;
     }
}
