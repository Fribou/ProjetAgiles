
import java.awt.BorderLayout;
.import java.awt.Color;
import java.awt.Dimension;
	import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	import javax.swing.JTextField;
	
public class JeuPendu extends JFrame{


boolean resultat=false;
	JPanel panel=new JPanel();
	JPanel panel5=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JPanel panel4=new JPanel();
	JPanel panel6=new JPanel();
	JTextField text= new JTextField(10);
	JTextField entre= new JTextField(10);
	JButton button=new JButton(new IciAction("tenter un mot"));
	JButton button2=new JButton(new IciRand("Commencez"));
	JButton valider=new JButton(new IciLettre("Valider"));
	public int nombre;
	
	JLabel mot = new  JLabel("Are you ready ?");
	JLabel Proposition = new  JLabel();
	JLabel select = new  JLabel();

	String[] liste={"aquarium","mobile","entrainement","domaine"};
	String[] lettre={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
	JComboBox alphabet = new JComboBox(lettre);
	Random rand = new Random();
	int valeur=rand.nextInt(4);
	int taille = liste[valeur].length();
	boolean present=false;
    ImagePanel panel7 = new ImagePanel(new ImageIcon("C:/pendu.jpg").getImage());
    char[] cara={};

		
	public JeuPendu(){
		super();
		build();
		init();
		setContentPane(panel);
		setVisible(true);
	}
	
	
	public class ItemAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {			
			
		}
		
	}
	
	
	public class IciAction extends AbstractAction{
		
		public IciAction(String texte){
			super(texte);
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			if(nombre>=10){
				JOptionPane.showMessageDialog(null,"Vous avez perdu car il ne vous reste plus d'essai");
				int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
				if(reply==JOptionPane.YES_OPTION){
					dispose();
					JeuPendu ne=new JeuPendu();
				}
				else{
					dispose();
			    	JOptionPane.showMessageDialog(null,"Merci d'être passé");
				}

			}
			else{
			
			Proposition.setText(text.getText());
			if( Proposition.getText().equals(liste[valeur])){
				mot.setText(liste[valeur]);
				Proposition.setText(liste[valeur]);
				resultat=true;}
			else
				
				if(Proposition.getText().length()==0)
					Proposition.setText("Vous n'avez rien rentré");
				else	
					Proposition.setText("Ce n'est pas "+ text.getText());
					nombre++;
			}
			if(resultat==true){
				JOptionPane.showMessageDialog(null,"Vous avez gagné en "+nombre+ " essaie");
				
			}
			
		}
		
		
	}
	
	
	
		public class IciRand extends AbstractAction{
			
			public IciRand(String texte){
				super(texte);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				nombre=0;
				String m ="_";
				for(int i=1;i<taille;i++)
					m=m+" _";	
				mot.setText(m+ ":"+liste[valeur].length()+" lettres");		
				button2.setEnabled(false);
						}
	}

		
		
	public class IciLettre extends AbstractAction{
			
			public IciLettre(String texte){
				super(texte);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				if(nombre>=10){
					JOptionPane.showMessageDialog(null,"Vous avez perdu car il ne vous reste plus d'essai");
					int reply = JOptionPane.showConfirmDialog(null, "Voulez-vous recommencer ?", "Recommencer", JOptionPane.YES_NO_OPTION);
					if(reply==JOptionPane.YES_OPTION){
						dispose();
						JeuPendu ne=new JeuPendu();
					}
					else{
						dispose();
				    	JOptionPane.showMessageDialog(null,"Merci d'être passé");
					}
				}
				else{
					int occu=0;
					for (int i=0;i<liste[valeur].length();i++)
				    {      
					  char charac=liste[valeur].charAt(i);
				      if (charac==((String) alphabet.getSelectedItem()).charAt(0))  {
				         System.out.println("ok");
				      		occu++;
							select.setText(occu+":"+charac);
				      		
				      		present=true;
				    }
				    } 
					nombre++;
					System.out.print(nombre);
					
					
					if(present==true){
					      alphabet.removeItem(alphabet.getSelectedItem());
					      
					}
				}
	}
}

	
	
	
	
	private void build(){	
		setTitle("Pendu");
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(true);		
    //    setContentPane(new ImagePanel(new ImageIcon("C:/pendu.jpg").getImage()));
		
	}
	
	String essai="Tentative "+nombre+ " sur 10";
	JLabel label= new JLabel(essai);
	
	private void init(){
		
		panel.setLayout(new BorderLayout());
		panel3.setLayout(new FlowLayout());
		panel4.setLayout(new BorderLayout());
		panel5.setLayout(new FlowLayout());
		panel6.setLayout(new FlowLayout());
		
		panel2.add(button2);
		panel3.add(label,FlowLayout.LEFT);
		panel3.add(text);
		
		panel5.add(button);
		panel5.add(Proposition);
		panel5.add(select);
		
		panel6.add(mot);
		panel6.add(alphabet);
		panel6.add(valider);
		
		panel4.add(panel5,BorderLayout.NORTH);
		panel4.add(panel6,BorderLayout.SOUTH);
		
		panel.add(panel2,BorderLayout.NORTH);
		panel.add(panel3,BorderLayout.CENTER);
		panel.add(panel4,BorderLayout.SOUTH);
	
		
		}
	
	class ImagePanel extends JPanel {

		  private Image img;

		  public ImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		    setPreferredSize(size);
		    setMinimumSize(size);
		    setMaximumSize(size);
		    setSize(size);
		    setLayout(null);
		  }

		  public void paintComponent(Graphics g) {
		    g.drawImage(img, 0, 0, null);
		  }
	}
		
		
}
