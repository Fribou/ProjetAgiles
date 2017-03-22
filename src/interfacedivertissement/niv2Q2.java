/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedivertissement;

import static interfacedivertissement.InterfaceDivertissement.choixHasard;
import static interfacedivertissement.InterfaceDivertissement.choixHasard2;
import static interfacedivertissement.InterfaceDivertissement.question1;
import static interfacedivertissement.InterfaceDivertissement.question10;
import static interfacedivertissement.InterfaceDivertissement.question11;
import static interfacedivertissement.InterfaceDivertissement.question12;
import static interfacedivertissement.InterfaceDivertissement.question13;
import static interfacedivertissement.InterfaceDivertissement.question14;
import static interfacedivertissement.InterfaceDivertissement.question15;
import static interfacedivertissement.InterfaceDivertissement.question16;
import static interfacedivertissement.InterfaceDivertissement.question17;
import static interfacedivertissement.InterfaceDivertissement.question18;
import static interfacedivertissement.InterfaceDivertissement.question19;
import static interfacedivertissement.InterfaceDivertissement.question2;
import static interfacedivertissement.InterfaceDivertissement.question20;
import static interfacedivertissement.InterfaceDivertissement.question21;
import static interfacedivertissement.InterfaceDivertissement.question22;
import static interfacedivertissement.InterfaceDivertissement.question23;
import static interfacedivertissement.InterfaceDivertissement.question24;
import static interfacedivertissement.InterfaceDivertissement.question3;
import static interfacedivertissement.InterfaceDivertissement.question4;
import static interfacedivertissement.InterfaceDivertissement.question5;
import static interfacedivertissement.InterfaceDivertissement.question6;
import static interfacedivertissement.InterfaceDivertissement.question7;
import static interfacedivertissement.InterfaceDivertissement.question8;
import static interfacedivertissement.InterfaceDivertissement.question9;
import static interfacedivertissement.InterfaceDivertissement.*;
import static interfacedivertissement.InterfaceDivertissement.rep10;
import static interfacedivertissement.InterfaceDivertissement.rep11;
import static interfacedivertissement.InterfaceDivertissement.rep12;
import static interfacedivertissement.InterfaceDivertissement.rep13;
import static interfacedivertissement.InterfaceDivertissement.rep14;
import static interfacedivertissement.InterfaceDivertissement.rep15;
import static interfacedivertissement.InterfaceDivertissement.rep16;
import static interfacedivertissement.InterfaceDivertissement.rep17;
import static interfacedivertissement.InterfaceDivertissement.rep18;
import static interfacedivertissement.InterfaceDivertissement.rep19;
import static interfacedivertissement.InterfaceDivertissement.rep2;
import static interfacedivertissement.InterfaceDivertissement.rep20;
import static interfacedivertissement.InterfaceDivertissement.rep21;
import static interfacedivertissement.InterfaceDivertissement.rep22;
import static interfacedivertissement.InterfaceDivertissement.rep23;
import static interfacedivertissement.InterfaceDivertissement.rep24;
import static interfacedivertissement.InterfaceDivertissement.rep3;
import static interfacedivertissement.InterfaceDivertissement.rep4;
import static interfacedivertissement.InterfaceDivertissement.rep5;
import static interfacedivertissement.InterfaceDivertissement.rep6;
import static interfacedivertissement.InterfaceDivertissement.rep7;
import static interfacedivertissement.InterfaceDivertissement.rep8;
import static interfacedivertissement.InterfaceDivertissement.rep9;
import static interfacedivertissement.Niveau1.n1;
import static interfacedivertissement.niv1Q2.n2;
import static interfacedivertissement.niv2Q1.n11;
import javax.swing.JOptionPane;

/**
 *
 * @author davy
 */
public class niv2Q2 extends javax.swing.JFrame {

    /**
     * Creates new form niv2Q2
     */
    String reponse;
    public static int n12;
    public niv2Q2() {
        initComponents();
        jProgressBar1.setValue(10);
        question();
    }

    
     private  void question(){
        int nombre=choixHasard2();
        n12=nombre;
        if(nombre==1 && n11!=1){
            jQ2.setText(question11);
            reponse=rep11;
        }
        else if(nombre==2 && n11!=2){
            jQ2.setText(question12);
            reponse=rep12;
        }
        else if(nombre==3 && n11!=3){
            jQ2.setText(question13);
            reponse=rep13;
        }
        else if(nombre==4 && n11!=4){
            jQ2.setText(question14);
            reponse=rep14;
        }
        else if(nombre==5 && n11!=5){
            jQ2.setText(question15);
            reponse=rep15;
        }
        else if(nombre==6 && n11!=6){
            jQ2.setText(question16);
            reponse=rep16;
        }
        else if(nombre==7 && n11!=7){
            jQ2.setText(question17);
            reponse=rep17;
        }
        else if(nombre==8 && n11!=8){
            jQ2.setText(question18);
            reponse=rep18;
        }
        else if(nombre==9 && n11!=9){
            jQ2.setText(question19);
            reponse=rep19;
        }
        else if(nombre==10 && n11!=10){
            jQ2.setText(question20);
            reponse=rep20;
        }
        else if(nombre==11 && n11!=11){
            jQ2.setText(question21);
            reponse=rep21;
        }else if(nombre==12 && n11!=12){
            jQ2.setText(question22);
            reponse=rep22;
        }else if(nombre==13 && n11!=13){
            jQ2.setText(question23);
            reponse=rep23;
        }else if(nombre==14 && n11!=14){
            jQ2.setText(question24);
            reponse=rep24;
        }
        else if(nombre==15 && n11!=15){
            jQ2.setText(question25);
            reponse=rep25;
        }
        else{
            question();
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jQ2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\davy\\Pictures\\bg.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(240, 240, 240))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Niveau 2");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("Question 2");

        jQ2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jQ2.setText("jLabel3");

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton1.setText("Vrai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1vrai(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton2.setText("Faux");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2faux(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addGap(61, 61, 61)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addComponent(jQ2)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1vrai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1vrai
        // TODO add your handling code here:
        if(reponse.equals("vrai")){
            new niv2Q3().setVisible(true);
            this.dispose();
        }
        else{

            int reply = JOptionPane.showConfirmDialog(null, "Mauvaise réponse, Recommencez ?", "Dommage", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                new niv2Q1().setVisible(true);
                this.dispose();
            }
            else{
                new level().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1vrai

    private void jButton2faux(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2faux
        // TODO add your handling code here:
        if(reponse.equals("faux")){
            new niv2Q3().setVisible(true);
            this.dispose();
        }
        else{

            int reply = JOptionPane.showConfirmDialog(null, "Mauvaise réponse, Recommencez ?", "Dommage", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                new niv2Q1().setVisible(true);
                this.dispose();
            }
            else{
                new level().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton2faux

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
            java.util.logging.Logger.getLogger(niv2Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(niv2Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(niv2Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(niv2Q2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new niv2Q2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jQ2;
    // End of variables declaration//GEN-END:variables
}
