/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SubmissaoDeArtigos.view;

import SubmissaoDeArtigos.controller.*;
import SubmissaoDeArtigos.model.*;

public class verSubmissaoView extends javax.swing.JFrame implements Observer {

    private Model model;
    private verSubmissaoController controller;
    private AutorView viewant;
    
    public verSubmissaoView() {
        initComponents();
    }

    public void initVerSubView(Model model, AutorView viewant) {
        this.model = model;
        this.viewant = viewant;
        model.attachObserver(this);
        verSubmissaoController controller = new verSubmissaoController();
        this.controller = controller;
        this.controller.initVerSubController(model, this);
    }
    
    public void update() {}//Implementado do Observer
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        statusview = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statusview1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        statusview2 = new javax.swing.JLabel();
        verAvaButton = new javax.swing.JButton();
        verArtigButton = new javax.swing.JButton();
        voltarbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("STATUS:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        statusview.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusview.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("REVISTA:");

        statusview1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nota Avaliação:");

        statusview2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        verAvaButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verAvaButton.setText("Ver Avaliação");
        verAvaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAvaButtonActionPerformed(evt);
            }
        });

        verArtigButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verArtigButton.setText("Ver Artigo Submetido");
        verArtigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verArtigButtonActionPerformed(evt);
            }
        });

        voltarbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        voltarbutton.setText("Voltar");
        voltarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(statusview2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(statusview1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statusview, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verAvaButton)
                .addGap(153, 153, 153)
                .addComponent(voltarbutton)
                .addGap(109, 109, 109))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(verArtigButton)
                    .addContainerGap(556, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(statusview, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(statusview1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(statusview2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verAvaButton)
                    .addComponent(voltarbutton))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(538, Short.MAX_VALUE)
                    .addComponent(verArtigButton)
                    .addGap(35, 35, 35)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarbuttonActionPerformed
        this.setVisible(false);
        viewant.setVisible(true);
    }//GEN-LAST:event_voltarbuttonActionPerformed

    private void verArtigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verArtigButtonActionPerformed
        controller.verArtigoSubmetido();
    }//GEN-LAST:event_verArtigButtonActionPerformed

    private void verAvaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAvaButtonActionPerformed
        controller.verAva();
    }//GEN-LAST:event_verAvaButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verSubmissaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel statusview;
    private javax.swing.JLabel statusview1;
    private javax.swing.JLabel statusview2;
    private javax.swing.JButton verArtigButton;
    private javax.swing.JButton verAvaButton;
    private javax.swing.JButton voltarbutton;
    // End of variables declaration//GEN-END:variables
}
