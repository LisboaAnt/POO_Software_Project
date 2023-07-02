/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SubmissaoDeArtigos.view;

import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.controller.*;

/**
 *
 * @author Windows 10
 */
public class AutorView extends javax.swing.JFrame implements Observer {

    private Model model;
    private AutorViewController controller;
    private Autor autor;

    
    public AutorView() { //Cria o objeto  TelaCadastro
        this.addWindowListener(new ProgramaFechador()); //Se fechar fecha certinho
        initComponents(); //Abre a tela

    }

    public void update() {//Implementado do Observer
    }

    
    // iniciador da tela do autor
    public void initAutorView(Model model) { // Cria o seu controller passando o Model e autor
        this.model = model;
        this.autor = autor;
        AutorViewController contr1 = new AutorViewController();	// Cria seu controller
	this.controller = contr1;
        this.controller.initAutorViewController(model,this);	
        model.attachObserver(this);
        tela();

    }
        
     //Mostra a tela   
    public void tela() {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            setVisible(true);
            
            
        }
    });
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textSubmissoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSubmissoes = new javax.swing.JList<>();
        textArtigos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTodosArtigos = new javax.swing.JList<>();
        buttonNovoArtigo = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        IrSubButton = new javax.swing.JButton();
        irArtButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textSubmissoes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textSubmissoes.setText("Suas Submissoes");

        listSubmissoes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listSubmissoesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listSubmissoes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSubmissoesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listSubmissoes);

        textArtigos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textArtigos.setText("Seus Artigos");

        listaTodosArtigos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaTodosArtigos);

        buttonNovoArtigo.setText("Novo Artigo");
        buttonNovoArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoArtigoActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        IrSubButton.setText("Ir");
        IrSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrSubButtonActionPerformed(evt);
            }
        });

        irArtButton.setText("Ir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(buttonNovoArtigo)
                        .addGap(109, 109, 109)
                        .addComponent(buttonSair))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textSubmissoes)
                                .addGap(473, 473, 473))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArtigos)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IrSubButton)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(irArtButton)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textSubmissoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IrSubButton)
                .addGap(18, 18, 18)
                .addComponent(textArtigos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(irArtButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNovoArtigo)
                    .addComponent(buttonSair))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoArtigoActionPerformed
        controller.NovoArtigo(autor); 
    }//GEN-LAST:event_buttonNovoArtigoActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void IrSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrSubButtonActionPerformed
        
    }//GEN-LAST:event_IrSubButtonActionPerformed

    private void listSubmissoesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listSubmissoesAncestorAdded
        
    }//GEN-LAST:event_listSubmissoesAncestorAdded

    private void listSubmissoesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSubmissoesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listSubmissoesValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IrSubButton;
    private javax.swing.JButton buttonNovoArtigo;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton irArtButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listSubmissoes;
    private javax.swing.JList<String> listaTodosArtigos;
    private javax.swing.JLabel textArtigos;
    private javax.swing.JLabel textSubmissoes;
    // End of variables declaration//GEN-END:variables
}
