/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedivertissement;

import static interfacedivertissement.InterfaceDivertissement.choixHasard;
import static interfacedivertissement.InterfaceDivertissement.question1;
import static interfacedivertissement.InterfaceDivertissement.question10;
import static interfacedivertissement.InterfaceDivertissement.question2;
import static interfacedivertissement.InterfaceDivertissement.question3;
import static interfacedivertissement.InterfaceDivertissement.question4;
import static interfacedivertissement.InterfaceDivertissement.question5;
import static interfacedivertissement.InterfaceDivertissement.question6;
import static interfacedivertissement.InterfaceDivertissement.question7;
import static interfacedivertissement.InterfaceDivertissement.question8;
import static interfacedivertissement.InterfaceDivertissement.question9;
import static interfacedivertissement.InterfaceDivertissement.rep1;
import static interfacedivertissement.InterfaceDivertissement.rep10;
import static interfacedivertissement.InterfaceDivertissement.rep2;
import static interfacedivertissement.InterfaceDivertissement.rep3;
import static interfacedivertissement.InterfaceDivertissement.rep4;
import static interfacedivertissement.InterfaceDivertissement.rep5;
import static interfacedivertissement.InterfaceDivertissement.rep6;
import static interfacedivertissement.InterfaceDivertissement.rep7;
import static interfacedivertissement.InterfaceDivertissement.rep8;
import static interfacedivertissement.InterfaceDivertissement.rep9;
import static interfacedivertissement.Niveau1.n1;
import static interfacedivertissement.niv1Q2.n2;
import static interfacedivertissement.niv1Q3.n3;
import javax.swing.JOptionPane;

/**
 *
 * @author davy
 */
public class niv1Q4 extends javax.swing.JFrame {

    /**
     * Creates new form niv1Q4
     */
    public static int n4;
    String reponse;
    public niv1Q4() {
        initComponents();
        question();
        jProgressBar1.setValue(30);
    }

    private  void question(){
        int nombre=choixHasard();
        n4=nombre;
        if(nombre==1 && n1!=1 && n2!=1 && n3!=1){
            jQ4.setText(question1);
            reponse=rep1;
        }
        else if(nombre==2 && n1!=2 && n2!=2 && n3!=2){
            jQ4.setText(question2);
            reponse=rep2;
        }
        else if(nombre==3 && n1!=3 && n2!=3 && n3!=3){
            jQ4.setText(question3);
            reponse=rep3;
        }
        else if(nombre==4 && n1!=4 && n2!=4 && n3!=4){
            jQ4.setText(question4);
            reponse=rep4;
        }
        else if(nombre==5 && n1!=5 && n2!=5 && n3!=5){
            jQ4.setText(question5);
            reponse=rep5;
        }
        else if(nombre==6 && n1!=6 && n2!=6 && n3!=6){
            jQ4.setText(question6);
            reponse=rep6;
        }
        else if(nombre==7 && n1!=7 && n2!=7 && n3!=7){
            jQ4.setText(question7);
            reponse=rep7;
        }
        else if(nombre==8 && n1!=8 && n2!=8 && n3!=8){
            jQ4.setText(question8);
            reponse=rep8;
        }
        else if(nombre==9 && n1!=9 && n2!=9 && n3!=9){
            jQ4.setText(question9);
            reponse=rep9;
        }
        else if(nombre==10 && n1!=10 && n2!=10 && n3!=10){
            jQ4.setText(question10);
            reponse=rep10;
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
        jQ4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("./src/images/bg.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Niveau 1");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("Question 4");

        jQ4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jQ4.setText("jLabel3");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jQ4, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jQ4)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1vrai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1vrai
        // TODO add your handling code here:
        if(reponse.equals("vrai")){
            new niv1Q5().setVisible(true);
            this.dispose();
        }
        else{

            int reply = JOptionPane.showConfirmDialog(null, "Mauvaise réponse, Recommencez ?", "Dommage", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                new Niveau1().setVisible(true);
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
            new niv1Q5().setVisible(true);
            this.dispose();
        }
        else{

            int reply = JOptionPane.showConfirmDialog(null, "Mauvaise réponse, Recommencez ?", "Dommage", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                new Niveau1().setVisible(true);
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
            java.util.logging.Logger.getLogger(niv1Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(niv1Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(niv1Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(niv1Q4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new niv1Q4().setVisible(true);
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
    private javax.swing.JLabel jQ4;
    // End of variables declaration//GEN-END:variables
}
