/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.iib;

import java.awt.Color;



/**
 *
 * @author Usuario
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGAliados = new javax.swing.ButtonGroup();
        lblArquero = new javax.swing.JLabel();
        lblGuerrero = new javax.swing.JLabel();
        lblMago = new javax.swing.JLabel();
        lblHealer = new javax.swing.JLabel();
        btnArquero = new javax.swing.JButton();
        btnAtaqueNormal = new javax.swing.JButton();
        btnAtaqueEspecial = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuerrero = new javax.swing.JButton();
        btnMago = new javax.swing.JButton();
        btnHealer = new javax.swing.JButton();
        rbtnGuerrero = new javax.swing.JRadioButton();
        rbtnMago = new javax.swing.JRadioButton();
        rbtnArquero = new javax.swing.JRadioButton();
        rbtnHealer = new javax.swing.JRadioButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblArquero.setText("Arquero");

        lblGuerrero.setText("Guerrero");

        lblMago.setText("Mago");

        lblHealer.setText("Healer");

        btnArquero.setText("Arquero");
        btnArquero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArqueroActionPerformed(evt);
            }
        });

        btnAtaqueNormal.setText("Ataque Normal");
        btnAtaqueNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueNormalActionPerformed(evt);
            }
        });

        btnAtaqueEspecial.setText("Ataque Especial");
        btnAtaqueEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueEspecialActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuerrero.setText("Guerrero");
        btnGuerrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuerreroActionPerformed(evt);
            }
        });

        btnMago.setText("Mago");
        btnMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagoActionPerformed(evt);
            }
        });

        btnHealer.setText("Healer");
        btnHealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealerActionPerformed(evt);
            }
        });

        btnGAliados.add(rbtnGuerrero);
        rbtnGuerrero.setText("Guerrero");

        btnGAliados.add(rbtnMago);
        rbtnMago.setText("Mago");

        btnGAliados.add(rbtnArquero);
        rbtnArquero.setText("Arquero");

        btnGAliados.add(rbtnHealer);
        rbtnHealer.setText("Healer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtaqueNormal)
                            .addComponent(btnCancelar)
                            .addComponent(btnAtaqueEspecial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnHealer)
                            .addComponent(rbtnArquero)
                            .addComponent(rbtnMago)
                            .addComponent(rbtnGuerrero))
                        .addContainerGap(170, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGuerrero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHealer)
                                            .addComponent(lblMago)
                                            .addComponent(lblArquero))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnArquero)
                                            .addComponent(btnMago)
                                            .addComponent(btnHealer)
                                            .addComponent(btnGuerrero)))))
                            .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblArquero)
                                .addComponent(btnArquero))
                            .addGap(141, 141, 141))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGuerrero)
                                .addComponent(btnGuerrero))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMago)
                                .addComponent(btnMago))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHealer)
                                .addComponent(btnHealer)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtnArquero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnGuerrero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnMago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnHealer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtaqueNormal)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtaqueEspecial)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAtaqueNormal.setVisible(false);
        btnAtaqueEspecial.setVisible(false);
        btnCancelar.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArqueroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArqueroActionPerformed
        btnGuerrero.setEnabled(false);
        btnMago.setEnabled(false);
        btnHealer.setEnabled(false);
        btnArquero.setForeground(Color.RED);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Lluvia de Flechas");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnArqueroActionPerformed

    private void btnHealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealerActionPerformed
        btnArquero.setEnabled(false);
        btnGuerrero.setEnabled(false);
        btnMago.setEnabled(false);
        btnHealer.setForeground(Color.RED);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Curar");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true); 
    }//GEN-LAST:event_btnHealerActionPerformed

    private void btnAtaqueEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtaqueEspecialActionPerformed

    private void btnAtaqueNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtaqueNormalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnArquero.setEnabled(true);
        btnGuerrero.setEnabled(true);
        btnMago.setEnabled(true);
        btnHealer.setEnabled(true);
        btnArquero.setForeground(Color.BLACK);
        btnGuerrero.setForeground(Color.BLACK);
        btnMago.setForeground(Color.BLACK);
        btnHealer.setForeground(Color.BLACK);
        btnAtaqueNormal.setVisible(false);
        btnAtaqueEspecial.setVisible(false);
        btnCancelar.setVisible(false);        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuerreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuerreroActionPerformed
        btnArquero.setEnabled(false);
        btnMago.setEnabled(false);
        btnHealer.setEnabled(false);
        btnGuerrero.setForeground(Color.RED);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Legado de Popeye");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true);        
    }//GEN-LAST:event_btnGuerreroActionPerformed

    private void btnMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagoActionPerformed
        btnArquero.setEnabled(false);
        btnGuerrero.setEnabled(false);
        btnHealer.setEnabled(false);
        btnMago.setForeground(Color.RED);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Bola de Fuego");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true);         
    }//GEN-LAST:event_btnMagoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquero;
    private javax.swing.JButton btnAtaqueEspecial;
    private javax.swing.JButton btnAtaqueNormal;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGAliados;
    private javax.swing.JButton btnGuerrero;
    private javax.swing.JButton btnHealer;
    private javax.swing.JButton btnMago;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JLabel lblArquero;
    private javax.swing.JLabel lblGuerrero;
    private javax.swing.JLabel lblHealer;
    private javax.swing.JLabel lblMago;
    private javax.swing.JRadioButton rbtnArquero;
    private javax.swing.JRadioButton rbtnGuerrero;
    private javax.swing.JRadioButton rbtnHealer;
    private javax.swing.JRadioButton rbtnMago;
    // End of variables declaration//GEN-END:variables
}
