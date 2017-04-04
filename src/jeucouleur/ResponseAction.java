/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeucouleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jeucouleur.StartAction.CouleurEnum;

/**
 *
 * @author p1502985
 */
class ResponseAction implements ActionListener {

    Window wind;
    
    public ResponseAction(Window wind) {
        this.wind = wind;   
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        
        //ne fait rien si pas de réponse atendu
        if(!wind.waintingResponse){
            wind.gameStatus.setText("Cliquer sur Start");
            return;
        }
            
        
        
        wind.gameStatus.setText("Sequence réponse en cour");
        
        
        CouleurEnum reponse = null;
        
        //determine quel couleur est choisi
        switch(e.getActionCommand()){
            case "RED" :
                reponse = CouleurEnum.Rouge;
                break;
            case "YELLOW" :
                reponse =CouleurEnum.Jaune;
                break;
            case "GREEN" :
                reponse =CouleurEnum.Vert;
                break;
            case "BLUE" :
                reponse =CouleurEnum.Bleu;
                break;
                
        }
        
        wind.posSequ++;
        
        
        //si on perd
        if( reponse != wind.listReponse.get(wind.posSequ-1) ){
            wind.gameStatus.setText("Perdu");
            resetReponse();
            resetLevel();
        }
            
        
        
        //si on est  la fin de la sequence
        if(wind.listReponse.size() <wind.posSequ+1){
            resetReponse();
            //on gagne
            wind.gameStatus.setText("Gagner");
              
        }
        
        
        
    
    }
    
    //prepare la fennetre pour un nouveau niveau
    public void resetReponse(){
        wind.posSequ = 0;
        wind.Start.setEnabled(true);
        wind.waintingResponse = false; 
        
        wind.ColorButtons[0].setEnabled(false);
        wind.ColorButtons[1].setEnabled(false);
        wind.ColorButtons[2].setEnabled(false);
        wind.ColorButtons[3].setEnabled(false);

        
    }
    //reinitialise les niveux
    public void resetLevel(){
        wind.level = 0;
    }
    
    
}