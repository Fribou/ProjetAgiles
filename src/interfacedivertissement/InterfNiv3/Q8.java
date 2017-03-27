/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedivertissement.InterfNiv3;

import static interfacedivertissement.InterfNiv3.Q1.num1;
import static interfacedivertissement.InterfNiv3.Q2.num2;
import static interfacedivertissement.InterfNiv3.Q3.num3;
import static interfacedivertissement.InterfNiv3.Q4.num4;
import static interfacedivertissement.InterfNiv3.Q5.num5;
import static interfacedivertissement.InterfNiv3.Q6.num6;
import static interfacedivertissement.InterfNiv3.Q7.num7;
import static interfacedivertissement.InterfaceDivertissement.choixHasard3;
import static interfacedivertissement.QuestionNiv3.question1;
import static interfacedivertissement.QuestionNiv3.question10;
import static interfacedivertissement.QuestionNiv3.question11;
import static interfacedivertissement.QuestionNiv3.question12;
import static interfacedivertissement.QuestionNiv3.question13;
import static interfacedivertissement.QuestionNiv3.question14;
import static interfacedivertissement.QuestionNiv3.question15;
import static interfacedivertissement.QuestionNiv3.question16;
import static interfacedivertissement.QuestionNiv3.question17;
import static interfacedivertissement.QuestionNiv3.question2;
import static interfacedivertissement.QuestionNiv3.question3;
import static interfacedivertissement.QuestionNiv3.question4;
import static interfacedivertissement.QuestionNiv3.question5;
import static interfacedivertissement.QuestionNiv3.question6;
import static interfacedivertissement.QuestionNiv3.question7;
import static interfacedivertissement.QuestionNiv3.question8;
import static interfacedivertissement.QuestionNiv3.question9;
import static interfacedivertissement.QuestionNiv3.reponse1;
import static interfacedivertissement.QuestionNiv3.reponse10;
import static interfacedivertissement.QuestionNiv3.reponse11;
import static interfacedivertissement.QuestionNiv3.reponse12;
import static interfacedivertissement.QuestionNiv3.reponse13;
import static interfacedivertissement.QuestionNiv3.reponse14;
import static interfacedivertissement.QuestionNiv3.reponse15;
import static interfacedivertissement.QuestionNiv3.reponse16;
import static interfacedivertissement.QuestionNiv3.reponse17;
import static interfacedivertissement.QuestionNiv3.reponse2;
import static interfacedivertissement.QuestionNiv3.reponse3;
import static interfacedivertissement.QuestionNiv3.reponse4;
import static interfacedivertissement.QuestionNiv3.reponse5;
import static interfacedivertissement.QuestionNiv3.reponse6;
import static interfacedivertissement.QuestionNiv3.reponse7;
import static interfacedivertissement.QuestionNiv3.reponse8;
import static interfacedivertissement.QuestionNiv3.reponse9;
import interfacedivertissement.level;
import javax.swing.JOptionPane;

/**
 *
 * @author davy
 */
public class Q8 extends javax.swing.JFrame {

    /**
     * Creates new form Q8
     */
    String reponse;
    public static int num8;
    public Q8() {
        initComponents();
        question();
        jProgressBar1.setValue(80);
    }
    
    private  void question(){
        int nombre=choixHasard3();
        num8=nombre;
        if(nombre==1 && num1!=1 && num2!=1 && num3!=1 && num4!=1 && num5!=1 && num6!=1 && num7!=1){
            jQ1.setText(question1);
            reponse=reponse1;
            choix1.setText("tigre");
            choix2.setText("explosion");
        }
        else if(nombre==2 && num1!=2 && num2!=2 && num3!=2 && num4!=2 && num5!=2 && num6!=2 && num7!=2){
            jQ1.setText(question2);
            reponse=reponse2;
            choix1.setText("vendredi");
            choix2.setText("samedi");
        }
         else if(nombre==3 && num1!=3 && num2!=3 && num3!=3 && num4!=3 && num5!=3 && num6!=3 && num7!=3){
            jQ1.setText(question3);
            reponse=reponse3;
            choix1.setText("oui");
            choix2.setText("non");
        }
         else if(nombre==4 && num1!=4 && num2!=4 && num3!=4 && num4!=4 && num5!=4 && num6!=4 && num7!=4){
            jQ1.setText(question4);
            reponse=reponse4;
            choix1.setText("France");
            choix2.setText("Autriche");
        }
         else if(nombre==5 && num1!=5 && num2!=5 && num3!=5 && num4!=5 && num5!=5 && num6!=5 && num7!=5){
            jQ1.setText(question5);
            reponse=reponse5;
            choix1.setText("Mont Blanc");
            choix2.setText("Himalaya");
        }
         else if(nombre==6 && num1!=6 && num2!=6 && num3!=6 && num4!=6 && num5!=6 && num6!=6 && num7!=6){
            jQ1.setText(question6);
            reponse=reponse6;
            choix1.setText("début");
            choix2.setText("fin");
        }
         else if(nombre==7 && num1!=7 && num2!=7 && num3!=7 && num4!=7 && num5!=7 && num6!=7 && num7!=7){
            jQ1.setText(question7);
            reponse=reponse7;
            choix1.setText("StarOffice");
            choix2.setText("PcOffice");
        }
         else if(nombre==8 && num1!=8 && num2!=8 && num3!=8 && num4!=8 && num5!=8 && num6!=8 && num7!=8){
            jQ1.setText(question8);
            reponse=reponse8;
            choix1.setText("Mis-à-jour régulièrement");
            choix2.setText("Disponible");
        }
         else if(nombre==9 && num1!=9 && num2!=9 && num3!=9 && num4!=9 && num5!=9 && num6!=9 && num7!=9){
            jQ1.setText(question9);
            reponse=reponse9;
            choix1.setText("Un envoi de courriers électroniques non désirés");
            choix2.setText("Un virus");
             
        } 
         else if(nombre==10 && num1!=10 && num2!=10 && num3!=10 && num4!=10 && num5!=10 && num6!=10 && num7!=10){
            jQ1.setText(question10);
            reponse=reponse10;
            choix1.setText("Un logiciel Open Source");
            choix2.setText("Un logiciel propriétaire");
             
        }
         else if(nombre==11 && num1!=11 && num2!=11 && num3!=11 && num4!=11 && num5!=11 && num6!=11 && num7!=11){
            jQ1.setText(question11);
            reponse=reponse11;
            choix1.setText("AB² = AC² + BC²");
            choix2.setText("CB² = AC² + BC²");
             
        }
         else if(nombre==12 && num1!=12 && num2!=12 && num3!=12 && num4!=12 && num5!=12 && num6!=12 && num7!=12){
            jQ1.setText(question12);
            reponse=reponse12;
            choix1.setText("AB² = AC² + BC²");
            choix2.setText("CB² = AC² + BC²");
             
        }
         else if(nombre==13 && num1!=13 && num2!=13 && num3!=13 && num4!=13 && num5!=13 && num6!=13 && num7!=13){
            jQ1.setText(question13);
            reponse=reponse13;
            choix1.setText("Mon neveu");
            choix2.setText("Mon cousin");
             
        }
         else if(nombre==14 && num1!=14 && num2!=14 && num3!=14 && num4!=14 && num5!=14 && num6!=14 && num7!=14){
            jQ1.setText(question14);
            reponse=reponse14;
            choix1.setText("La conductance");
            choix2.setText("La conductance");
             
        }
         else if(nombre==15 && num1!=15 && num2!=15 && num3!=15 && num4!=15 && num5!=15 && num6!=15 && num7!=15){
            jQ1.setText(question15);
            reponse=reponse15;
            choix1.setText("2");
            choix2.setText("3");
             
        }
         else if(nombre==16 && num1!=16 && num2!=16 && num3!=16 && num4!=16 && num5!=16 && num6!=16 && num7!=16){
            jQ1.setText(question16);
            reponse=reponse16;
            choix1.setText("362880");
            choix2.setText("362881");
             
        }
         else if(nombre==17 && num1!=17 && num2!=17 && num3!=17 && num4!=17 && num5!=17 && num6!=17 && num7!=17){
            jQ1.setText(question17 );
            reponse=reponse17;
            choix1.setText("2 personnes");
            choix2.setText("1 personne");
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

        choix1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jQ1 = new javax.swing.JLabel();
        choix2 = new javax.swing.JButton();
        autre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        choix1.setFont(new java.awt.Font("Times New Roman", 3, 20));
        choix1.setText("Vrai");
        choix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix1vrai(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\davy\\Pictures\\bg.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Niveau 3");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("Question 8");

        jQ1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jQ1.setText("jLabel3");

        choix2.setFont(new java.awt.Font("Times New Roman", 3, 20));
        choix2.setText("Vrai");
        choix2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix2vrai(evt);
            }
        });

        autre.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        autre.setText("Autre");
        autre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autrevrai(evt);
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
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel6)))
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jQ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(choix1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(choix2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(autre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jQ1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(autre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(choix1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choix1vrai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choix1vrai
        // TODO add your handling code here:
        if(reponse.equals(choix1.getText())){
            new Q9().setVisible(true);
            this.dispose();
        }
        else{
            int reply = JOptionPane.showConfirmDialog(null, "Mauvaise réponse, Voulez-vous recommencer ?", "Dommage", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                new Q1().setVisible(true);
                this.dispose();
            }
            else{
                new level().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_choix1vrai

    private void choix2vrai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choix2vrai
        // TODO add your handling code here:
        if(reponse.equals(choix2.getText())){
            new Q9().setVisible(true);
            this.dispose();
        }
        else{
            int reply = JOptionPane.showConfirmDialog(null, "Mauvaise réponse, Voulez-vous recommencer ?", "Dommage", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                new Q1().setVisible(true);
                this.dispose();
            }
            else{
                new level().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_choix2vrai

    private void autrevrai(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autrevrai
        // TODO add your handling code here:
        if(reponse.equals(autre.getText())){
            new Q9().setVisible(true);
            this.dispose();
        }
        else{
            int reply = JOptionPane.showConfirmDialog(null, "Mauvaise réponse, Voulez-vous recommencer ?", "Dommage", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                new Q1().setVisible(true);
                this.dispose();
            }
            else{
                new level().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_autrevrai

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
            java.util.logging.Logger.getLogger(Q8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autre;
    private javax.swing.JButton choix1;
    private javax.swing.JButton choix2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jQ1;
    // End of variables declaration//GEN-END:variables
}
