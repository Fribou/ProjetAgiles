import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FenetreDebut {

		FenetreDebut(){
			ImageIcon icon = new ImageIcon("C:/PIHM/dés.png");
			JLabel label = new JLabel(icon);
			String message ="voulez vous vous amuser ?  :)";
			String titre="Quelle est votre choix";
			int reply = JOptionPane.showConfirmDialog(null, label, titre, JOptionPane.YES_NO_OPTION);
			String Aurevoir="Merci d'être passé  XD";
		    if (reply == JOptionPane.YES_OPTION)
		    {
		    	Accueil accueil= new Accueil();
		    }
		    else
		    	JOptionPane.showMessageDialog(null,Aurevoir);

}
		
}
