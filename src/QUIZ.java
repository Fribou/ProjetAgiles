import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class QUIZ {
String Message;
String Message2;
String Message3;
String Message4;
String Message5;
int nombre=0;

QUIZ(){
	int reply0 = JOptionPane.showConfirmDialog(null, "Commencer ?", "Question 1", JOptionPane.YES_NO_OPTION);
	if(reply0==JOptionPane.YES_OPTION){
		

	
	int reply = JOptionPane.showConfirmDialog(null, "Ribery joue t-il au Borrussia Dortmunt ?", "Question 1", JOptionPane.YES_NO_OPTION);
	
	if(reply==JOptionPane.YES_OPTION){
	      ImageIcon icon = new ImageIcon(new ImageIcon("C:\\ribery.jpe").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));

			Message= "Mauvaise reponse , Ribery joue au Bayern de Munich";
			JOptionPane.showMessageDialog(null,Message,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	else{
		 Message= "Bonne reponse , Ribery joue au Bayern de Munich";
			nombre++;
		      ImageIcon icon = new ImageIcon(new ImageIcon("C:\\ribery.jpe").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
			JOptionPane.showMessageDialog(null,Message,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon);}
	
			
			
			
			
			
	int reply2 = JOptionPane.showConfirmDialog(null, "Davy est- il le plus stylé de l'IUT ?", "Question 2", JOptionPane.YES_NO_OPTION);
	
	
	if(reply2==JOptionPane.YES_OPTION){
	      ImageIcon icon2 = new ImageIcon(new ImageIcon("C:\\moi.jpg").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
		Message2= "Bonne reponse , Davy est la personne avec le plus de style";
		JOptionPane.showMessageDialog(null,Message2,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon2);
		nombre++;
	}
	else{
		Message2= "Mauvaisee reponse , porte des lunettes";
	      ImageIcon icon2 = new ImageIcon(new ImageIcon("C:\\moi.jpg").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
		JOptionPane.showMessageDialog(null,Message2,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon2);
	}
	
	
	
	
	
	
	int reply3 = JOptionPane.showConfirmDialog(null, "La phrase 'reste avec moi jeune homme'  est tirée de M.Kaldhi?", "Question 3", JOptionPane.YES_NO_OPTION);
	
	
	if(reply3==JOptionPane.YES_OPTION){
	      ImageIcon icon3 = new ImageIcon(new ImageIcon("C:\\ribery.jpe").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
		Message3= "Bonne reponse ";
		JOptionPane.showMessageDialog(null,Message3);
		nombre++;
	}
	else{
		Message3= "Mauvaisee reponse ";
	      ImageIcon icon3 = new ImageIcon(new ImageIcon("C:\\ribery.jpe").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
		JOptionPane.showMessageDialog(null,Message3);
	}
	
	
	
	
	
	
	
	int reply4 = JOptionPane.showConfirmDialog(null, "Si Winnie et Porcinet ce battent en combat singulier, est-ce que Porcinet gagne?", "Question 4", JOptionPane.YES_NO_OPTION);
	
	if(reply4==JOptionPane.YES_OPTION){	
		ImageIcon icon4 = new ImageIcon(new ImageIcon("C:\\winni.jpg").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));

		Message4= "Mauvaisee reponse ,porcinet chatouillera winnie";
		JOptionPane.showMessageDialog(null,Message4,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon4);
	}
	else{
	 Message4= "Mauvaise reponse , winnie ne se battera jamais";
     ImageIcon icon4 = new ImageIcon(new ImageIcon("C:\\winni.jpg").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
		JOptionPane.showMessageDialog(null,Message4,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon4);
	}
	
		
		
		
	int reply5 = JOptionPane.showConfirmDialog(null, "L'allemagne a t-elle gagnée l'Euro 2012 ?", "Question 5", JOptionPane.YES_NO_OPTION);

	if(reply5==JOptionPane.YES_OPTION){
	      ImageIcon icon5 = new ImageIcon(new ImageIcon("C:\\euro.jpe").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));

		Message5= "Mauvaisee reponse ,L'allemagne a gangé la coupe du monde en 2014 et l'Espagne à gagné l'Euro";
		JOptionPane.showMessageDialog(null,Message5,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon5);
	}
	else{
	 Message5= "Bonne reponse , L'allemagne a gangé la coupe du monde en 2014 et l'Espagne à gagné l'Euro";
		
     ImageIcon icon5 = new ImageIcon(new ImageIcon("C:\\euro.jpe").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
     JOptionPane.showMessageDialog(null,Message5,"Reponse", JOptionPane.INFORMATION_MESSAGE, icon5);
	 nombre++;
	}
	 
	 JOptionPane.showMessageDialog(null,"votre score est de :"+nombre+" sur 5");
	}
	else{
		String Aurevoir="Merci d'être passé  XD";
		JOptionPane.showMessageDialog(null,Aurevoir);}

		
		
	
		
	
}


	
}
