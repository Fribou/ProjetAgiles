/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeucouleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingUtilities;
import jeucouleur.StartAction.CouleurEnum;

/**
 *
 * @author p1502985
 */
class StartAction implements ActionListener {


    //cré une sequance de couleur aléatoire
    private ArrayList<CouleurEnum> InitseqCouleurs(int level) {
        ArrayList<CouleurEnum> list;
        list = new ArrayList<>();
        
        Random rand = new Random() ;
        int nombreAleatoire;
        
        for(int i =0;i<level;i++){
            
            
            
            
            
            nombreAleatoire = rand.nextInt(level) ;//
            
            //System.out.println(nombreAleatoire); // DEBUG <-----------------
            
            switch(nombreAleatoire){
                case 0 :
                    list.add(CouleurEnum.Rouge);
                    break;
                case 1 :
                    list.add(CouleurEnum.Bleu);
                    break;
                case 2 :
                    list.add(CouleurEnum.Jaune);
                    break;
                default :
                    list.add(CouleurEnum.Vert);
                    break;

            }
            
            
        }
        wind.listReponse = list;
        return list;
    }
    
    public enum CouleurEnum {Rouge,Bleu, Vert,Jaune;}
    Window wind;
    static int count = 0;
    
    
    public StartAction(Window wind) {
        this.wind = wind;
    }
    
    
    public void hideColor(){
        wind.Couleurs[0].setVisible(false);
        wind.Couleurs[1].setVisible(false);
        wind.Couleurs[2].setVisible(false);
        wind.Couleurs[3].setVisible(false);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
    
        wind.level++;
        wind.gameLevel.setText("Level :" + Integer.toString( wind.level));
        
        //desactive bouton
        wind.Start.setEnabled(false);
        wind.ColorButtons[0].setEnabled(false);
        wind.ColorButtons[1].setEnabled(false);
        wind.ColorButtons[2].setEnabled(false);
        wind.ColorButtons[3].setEnabled(false);
        
        wind.waintingResponse = true;
        
        ArrayList<CouleurEnum> seqCouleurs;
        seqCouleurs = InitseqCouleurs(wind.level);
        
        count =0;
        hideColor();
        
        wind.gameStatus.setText("En attente de réponse");
        
        
        
        
        //Le second thread
        new Thread(new Runnable(){
          public void run(){
            for(int i = 0; i < wind.level+1; i++){
                
                
              try {
                Thread.sleep(500);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              //Modification de notre composant dans l'EDT
              Thread t = new Thread(new Runnable(){
                public void run(){
                    count++;
           
                    hideColor();

                    //si c'est la fin de la sequence
                    if(count >wind.level){
                          wind.Couleurs[0].setVisible(true);
                          wind.Couleurs[1].setVisible(true);
                          wind.Couleurs[2].setVisible(true);
                          wind.Couleurs[3].setVisible(true);

                          wind.ColorButtons[0].setEnabled(true);
                          wind.ColorButtons[1].setEnabled(true);
                          wind.ColorButtons[2].setEnabled(true);
                          wind.ColorButtons[3].setEnabled(true);

                          wind.setTitle("Jeu Couleurs");
                    }
                    else  //affiche la couleur
                    {

                       wind.setTitle("Couleur numéro : " + count);
                       wind.num.setText(Integer.toString(count));

                      switch(seqCouleurs.get(count-1)){
                          case Rouge :
                              wind.Couleurs[0].setVisible(true);
                              break;
                          case Vert :
                              wind.Couleurs[1].setVisible(true);
                              break;
                         case Bleu :
                              wind.Couleurs[2].setVisible(true);
                              break;
                         case Jaune :
                              wind.Couleurs[3].setVisible(true);
                              break;
                      }
                    }

                }
              });
              if(SwingUtilities.isEventDispatchThread())
                t.start();
              else{
                SwingUtilities.invokeLater(t);
              }
            }
          }
        }).start();           
    } 
}































        
        
    