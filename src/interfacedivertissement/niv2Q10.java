/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedivertissement;

import static interfacedivertissement.InterfaceDivertissement.act3;
import static interfacedivertissement.InterfaceDivertissement.choixHasard2;
import static interfacedivertissement.InterfaceDivertissement.question11;
import static interfacedivertissement.InterfaceDivertissement.question12;
import static interfacedivertissement.InterfaceDivertissement.question13;
import static interfacedivertissement.InterfaceDivertissement.question14;
import static interfacedivertissement.InterfaceDivertissement.question15;
import static interfacedivertissement.InterfaceDivertissement.question16;
import static interfacedivertissement.InterfaceDivertissement.question17;
import static interfacedivertissement.InterfaceDivertissement.question18;
import static interfacedivertissement.InterfaceDivertissement.question19;
import static interfacedivertissement.InterfaceDivertissement.question20;
import static interfacedivertissement.InterfaceDivertissement.rep11;
import static interfacedivertissement.InterfaceDivertissement.rep12;
import static interfacedivertissement.InterfaceDivertissement.rep13;
import static interfacedivertissement.InterfaceDivertissement.rep14;
import static interfacedivertissement.InterfaceDivertissement.rep15;
import static interfacedivertissement.InterfaceDivertissement.rep16;
import static interfacedivertissement.InterfaceDivertissement.rep17;
import static interfacedivertissement.InterfaceDivertissement.rep18;
import static interfacedivertissement.InterfaceDivertissement.rep19;
import static interfacedivertissement.InterfaceDivertissement.*;
import static interfacedivertissement.niv2Q1.n11;
import static interfacedivertissement.niv2Q2.n12;
import static interfacedivertissement.niv2Q3.n13;
import static interfacedivertissement.niv2Q4.n14;
import static interfacedivertissement.niv2Q5.n15;
import static interfacedivertissement.niv2Q6.n16;
import static interfacedivertissement.niv2Q7.n17;
import static interfacedivertissement.niv2Q8.n18;
import static interfacedivertissement.niv2Q9.n19;
import javax.swing.JOptionPane;

/**
 *
 * @author davy
 */
public class niv2Q10 extends javax.swing.JFrame {

    /**
     * Creates new form niv2Q10
     */
    String reponse;
    public niv2Q10() {
        initComponents();
        jProgressBar1.setValue(90);
        question();
    }

    
     private  void question(){
        int nombre=choixHasard2();
        if(nombre==1 && n11!=1 && n12!=1 && n13!=1 && n14!=1 && n15!=1 && n16!=1 && n17!=1 && n18!=1 && n19!=1){
            jQ3.setText(question11);
            reponse=rep11;
        }
        else if(nombre==2 && n11!=2 && n12!=2 && n13!=2 && n14!=2 && n15!=2 && n16!=2 && n17!=2 && n18!=2 && n19!=2){
            jQ3.setText(question12);
            reponse=rep12;
        }
        else if(nombre==3 && n11!=3 && n12!=3 && n13!=3 && n14!=3 && n15!=3 && n16!=3 && n17!=3 && n18!=3 && n19!=3){
            jQ3.setText(question13);
            reponse=rep13;
        }
        else if(nombre==4 && n11!=4 && n12!=4 && n13!=4 && n14!=4 && n15!=4 && n16!=4 && n17!=4 && n18!=4 && n19!=4){
            jQ3.setText(question14);
            reponse=rep14;
        }
        else if(nombre==5 && n11!=5 && n12!=5 && n13!=5 && n14!=5 && n15!=5 && n16!=5 && n17!=5 && n18!=5 && n19!=5){
            jQ3.setText(question15);
            reponse=rep15;
        }
        else if(nombre==6 && n11!=6 && n12!=6 && n13!=6 && n14!=6 && n15!=6 && n16!=6 && n17!=6 && n18!=6 && n19!=7){
            jQ3.setText(question16);
            reponse=rep16;
        }
        else if(nombre==7 && n11!=7 && n12!=7 && n13!=7 && n14!=7 && n15!=7 && n16!=7 && n17!=7 && n18!=7 && n19!=7){
            jQ3.setText(question17);
            reponse=rep17;
        }
        else if(nombre==8 && n11!=8 && n12!=8 && n13!=8 && n14!=8 && n15!=8 && n16!=8 && n17!=8 && n18!=8 && n19!=8){
            jQ3.setText(question18);
            reponse=rep18;
        }
        else if(nombre==9 && n11!=9 && n12!=9 && n13!=9 && n14!=9 && n15!=9 && n16!=9 && n17!=9 && n18!=9 && n19!=9){
            jQ3.setText(question19);
            reponse=rep19;
        }
        else if(nombre==10 && n11!=10 && n12!=10 && n13!=10 && n14!=10 && n15!=10 && n16!=10 && n17!=10 && n18!=10 && n19!=10){
            jQ3.setText(question20);
            reponse=rep20;
        }
        else if(nombre==11 && n11!=11 && n12!=11 && n13!=11 && n14!=11 && n15!=11 && n16!=11 && n17!=11 && n18!=11 && n19!=11){
            jQ3.setText(question21);
            reponse=rep21;
        }
        else if(nombre==12 && n11!=12 && n12!=12 && n13!=12 && n14!=12 && n15!=12 && n16!=12 && n17!=12 && n18!=12 && n19!=12){
            jQ3.setText(question22);
            reponse=rep22;
        }else if(nombre==13 && n11!=13 && n12!=13 && n13!=13 && n14!=13 && n15!=13 && n16!=13 && n17!=13 && n18!=13 && n19!=13){
            jQ3.setText(question23);
            reponse=rep23;
        }else if(nombre==14 && n11!=14 && n12!=14 && n13!=14 && n14!=14 && n15!=14 && n16!=14 && n17!=14 && n18!=14 && n19!=14){
            jQ3.setText(question24);
            reponse=rep24;
        }
        else if(nombre==15 && n11!=15 && n12!=15 && n13!=15 && n14!=15 && n15!=15 && n16!=15 && n17!=15 && n18!=15 && n19!=15){
            jQ3.setText(question25);
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
        jQ3 = new javax.swing.JLabel();
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Niveau 2");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("Question 10");

        jQ3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jQ3.setText("jLabel3");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
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
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addComponent(jQ3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1vrai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1vrai
        // TODO add your handling code here:
        if(reponse.equals("vrai")){
            JOptionPane.showMessageDialog(null,"félicitation, vous avez terminé le niveau 2","fin", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            act3=true;
            new level().setVisible(true);
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
            JOptionPane.showMessageDialog(null,"félicitation, vous avez terminé le niveau 2","Reponse", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            act3=true;
            new level().setVisible(true);
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
            java.util.logging.Logger.getLogger(niv2Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(niv2Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(niv2Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(niv2Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new niv2Q10().setVisible(true);
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
    private javax.swing.JLabel jQ3;
    // End of variables declaration//GEN-END:variables
}
