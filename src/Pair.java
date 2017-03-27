import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Date;
import java.util.Random;
import java.util.TimerTask;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Pair extends MouseAdapter implements MouseMotionListener{
	MyPanel p= new MyPanel();
	JPanel panel=new JPanel();
	Random rand = new Random();
	int valeur=rand.nextInt(6);
	String[] liste={"bleu","jaune","rouge","noir","gris","blanc"};
	JButton Commencer=new JButton(new IciRand("Commencez"));
	int nombre=0;
	int temp=0;
        boolean tre=false;
	JLabel score=new JLabel("Votre score est de : "+nombre);
	JFrame f = new JFrame("Casse t�te"); 
	
	Pair(){
	      
	
	panel.setLayout(new FlowLayout());
	panel.add(Commencer);
	panel.add(score);
	p.add(panel,BorderLayout.NORTH);
	f.add(p);
	f.pack(); 
	f.setVisible(true);
	f.setLocationRelativeTo(null);
	f.setBackground(new Color(107, 106, 104));
	f.addMouseListener(this);
	f.addMouseMotionListener(this);
	
	
    
	}
	
	
	public class IciRand extends AbstractAction{
		
		public IciRand(String texte){
			super(texte);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(liste[valeur]=="rouge")
				p.setBackground(Color.red);
			else if(liste[valeur]=="bleu")
				p.setBackground(Color.blue);
			else if(liste[valeur]=="blanc")
				p.setBackground(Color.white);
			else if(liste[valeur]=="jaune")
				p.setBackground(Color.yellow);
			else if(liste[valeur]=="gris")
				p.setBackground(Color.gray);
			else
				p.setBackground(Color.black);
			Commencer.setEnabled(false);
					}
}
        
        private void Commencer(java.awt.event.ActionEvent evt) {
            tre=true;
        }     
	
	
	
	
	

	
	

	public void mouseClicked(MouseEvent e) {
		  
            
		if(e.getY()>=50 && e.getY()<=150 &&  e.getX()>=50 && e.getX()<=150 ){
			System.out.println(liste[valeur]);
				if(liste[valeur]=="bleu"){
					Random rand2 = new Random();				
					valeur=rand2.nextInt(6);
					if(liste[valeur]=="rouge")
						p.setBackground(Color.red);
					else if(liste[valeur]=="bleu")
						p.setBackground(Color.blue);
					else if(liste[valeur]=="blanc")
						p.setBackground(Color.white);
					else if(liste[valeur]=="jaune")
						p.setBackground(Color.yellow);
					else if(liste[valeur]=="gris")
						p.setBackground(Color.gray);
					else
						p.setBackground(Color.black);
					System.out.println("bleu");
					nombre++;
			}
			else{
				JOptionPane.showMessageDialog(null,"Vous avez perdu car ce n'est pas la bonne case"
						+ "\nVotre score est de :"+nombre);
				int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
				if(reply==JOptionPane.YES_OPTION){
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						f.dispose();
					Pair ne=new Pair();
				}
				else{
				
			    	JOptionPane.showMessageDialog(null,"Merci d'�tre pass�");
				}

			}
				}
			
		if(e.getY()>=50 && e.getY()<=150 &&  e.getX()>=170 && e.getX()<=270 ){
			System.out.println(liste[valeur]);
				if(liste[valeur]=="jaune"){
					System.out.println("jaune");
					Random rand2 = new Random();
					valeur=rand2.nextInt(6);
					if(liste[valeur]=="rouge")
						p.setBackground(Color.red);
					else if(liste[valeur]=="bleu")
						p.setBackground(Color.blue);
					else if(liste[valeur]=="blanc")
						p.setBackground(Color.white);
					else if(liste[valeur]=="jaune")
						p.setBackground(Color.yellow);
					else if(liste[valeur]=="gris")
						p.setBackground(Color.gray);
					else
						p.setBackground(Color.black);
					nombre++;}
				else{
					JOptionPane.showMessageDialog(null,"Vous avez perdu car ce n'est pas la bonne case"+ "\nVotre score est de :"+nombre);
					int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
					if(reply==JOptionPane.YES_OPTION){
							f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							f.dispose();
						Pair ne=new Pair();
					}
					else{
					
				    	JOptionPane.showMessageDialog(null,"Merci d'�tre pass�");
					}
				}
}
		
		if(e.getY()>=50 && e.getY()<=150 &&  e.getX()>=290 && e.getX()<=390 ){
			System.out.println("ok3");
			System.out.println(liste[valeur]);
			if(liste[valeur]=="gris"){
				System.out.println("gris");
				Random rand2 = new Random();
				valeur=rand2.nextInt(6);
				if(liste[valeur]=="rouge")
					p.setBackground(Color.red);
				else if(liste[valeur]=="bleu")
					p.setBackground(Color.blue);
				else if(liste[valeur]=="blanc")
					p.setBackground(Color.white);
				else if(liste[valeur]=="jaune")
					p.setBackground(Color.yellow);
				else if(liste[valeur]=="gris")
					p.setBackground(Color.gray);
				else
					p.setBackground(Color.black);
				nombre++;}
			else{
				JOptionPane.showMessageDialog(null,"Vous avez perdu car ce n'est pas la bonne case"+ "\nVotre score est de :"+nombre);
				int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
				if(reply==JOptionPane.YES_OPTION){
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
						f.dispose();
					Pair ne=new Pair();
				}
				else{
				
			    	JOptionPane.showMessageDialog(null,"Merci d'�tre pass�");
				}
			}
}
		
		if(e.getY()>=170 && e.getY()<=270 &&  e.getX()>=50 && e.getX()<=150 ){
			System.out.println("noir");
			System.out.println(liste[valeur]);
			if(liste[valeur]=="noir"){
				System.out.println("ok");
				Random rand2 = new Random();
				valeur=rand2.nextInt(6);
				if(liste[valeur]=="rouge")
					p.setBackground(Color.red);
				else if(liste[valeur]=="bleu")
					p.setBackground(Color.blue);
				else if(liste[valeur]=="blanc")
					p.setBackground(Color.white);
				else if(liste[valeur]=="jaune")
					p.setBackground(Color.yellow);
				else if(liste[valeur]=="gris")
					p.setBackground(Color.gray);
				else
					p.setBackground(Color.black);
				nombre++;
			}
			else{
				JOptionPane.showMessageDialog(null,"Vous avez perdu car ce n'est pas la bonne case"+ "\nVotre score est de :"+nombre);
				int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
				if(reply==JOptionPane.YES_OPTION){
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
						f.dispose();
					Pair ne=new Pair();
				}
				else{
				
			    	JOptionPane.showMessageDialog(null,"Merci d'�tre pass�");
				}
			}
}
		
		if(e.getY()>=170 && e.getY()<=270 &&  e.getX()>=170 && e.getX()<=270 ){
			System.out.println("ok");
			//p.setBackground(Color.white);
			System.out.println(liste[valeur]);
			if(liste[valeur]=="blanc"){
				System.out.println("blanc");
				Random rand2 = new Random();
				valeur=rand2.nextInt(6);
				if(liste[valeur]=="rouge")
					p.setBackground(Color.red);
				else if(liste[valeur]=="bleu")
					p.setBackground(Color.blue);
				else if(liste[valeur]=="blanc")
					p.setBackground(Color.white);
				else if(liste[valeur]=="jaune")
					p.setBackground(Color.yellow);
				else if(liste[valeur]=="gris")
					p.setBackground(Color.gray);
				else
					p.setBackground(Color.black);
				nombre++;}
			else{
				JOptionPane.showMessageDialog(null,"Vous avez perdu car ce n'est pas la bonne case"+ "\nVotre score est de :"+nombre);
				int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
				if(reply==JOptionPane.YES_OPTION){
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
						f.dispose();
					Pair ne=new Pair();
				}
				else{
				
			    	JOptionPane.showMessageDialog(null,"Merci d'�tre pass�");
				}
			}
}
		
		if(e.getY()>=170 && e.getY()<=270 &&  e.getX()>=290 && e.getX()<=390 ){
			System.out.println("ok");
		//	p.setBackground(Color.red);
			System.out.println(liste[valeur]);
			if(liste[valeur]=="rouge"){
				System.out.println("rouge");
			Random rand2 = new Random();
			valeur=rand2.nextInt(6);
			if(liste[valeur]=="rouge")
				p.setBackground(Color.red);
			else if(liste[valeur]=="bleu")
				p.setBackground(Color.blue);
			else if(liste[valeur]=="blanc")
				p.setBackground(Color.white);
			else if(liste[valeur]=="jaune")
				p.setBackground(Color.yellow);
			else if(liste[valeur]=="gris")
				p.setBackground(Color.gray);
			else
				p.setBackground(Color.black);
			nombre++;
			}
			
			else{
				JOptionPane.showMessageDialog(null,"Vous avez perdu car ce n'est pas la bonne case"+ "\nVotre score est de :"+nombre);
				int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
				if(reply==JOptionPane.YES_OPTION){
						f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
						f.dispose();
						Pair ne=new Pair();
				}
				else{
				
			    	JOptionPane.showMessageDialog(null,"Merci d'�tre pass�");
				}
			}
}
			
		}
		  }

	  
	
	
	
	




	class MyPanel extends JPanel { 
		public MyPanel() {
			setBorder(BorderFactory.createLineBorder(Color.black));
		}
		
		
		public Dimension getPreferredSize() {
			return new Dimension(450,350); } 
		
		
	
	
	

		protected void paintComponent(Graphics g) { 
			super.paintComponent(g); 
			
			g.setColor(Color.black);
			g.drawRect(50, 50, 100, 100);
			g.setColor(Color.green);
			g.fillRect(50, 50, 100, 100);

			g.setColor(Color.black);
			g.drawRect(170, 50, 100, 100);
			g.setColor(Color.green);
			g.fillRect(170, 50, 100, 100);

			g.setColor(Color.black);
			g.drawRect(290, 50, 100, 100);
			g.setColor(Color.green);
			g.fillRect(290, 50, 100, 100);

			g.setColor(Color.black);
			g.drawRect(50, 170, 100, 100);
			g.setColor(Color.green);
			g.fillRect(50, 170, 100, 100);

			g.setColor(Color.black);
			g.drawRect(170, 170, 100, 100);
			g.setColor(Color.green);
			g.fillRect(170,170, 100, 100);

			g.setColor(Color.black);
			g.drawRect(290, 170, 100, 100);
			g.setColor(Color.green);
			g.fillRect(290, 170, 100, 100);

			}
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
