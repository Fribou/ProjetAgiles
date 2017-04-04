/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeucouleur;

import javax.swing.SwingUtilities;


public class JeuCouleur {

    /**
     * @param args the command line arguments
     */
    public static void main() {
        
   SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                Window maFennetre = new Window();
                maFennetre.setVisible(true);
            }
            
            
        });
    }
}
