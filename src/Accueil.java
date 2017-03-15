
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.MenuBar;
	import java.awt.event.ActionEvent;

	import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;




	public class Accueil extends JFrame {
		JLabel label = new JLabel();
		JLabel choix = new JLabel("A quoi voulez-vous jouer ?");
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();
		JMenuBar menuBar = new JMenuBar();
		JMenu couleur = new JMenu("Couleur");
		JMenu musique = new JMenu("Musique");
		JMenu regle = new JMenu("Regle");
		JMenu auteur = new JMenu("A Propos");
		JMenuItem mus = new JMenuItem(new Icimusique("Liste des Musiques"));
		JMenuItem sardine = new JMenuItem(new Iciplayliste("Créé Playliste"));
		JMenuItem kalash = new JMenuItem("Modifié Playliste");
		JRadioButtonMenuItem davy = new JRadioButtonMenuItem(new IciQui("davy"));
		JRadioButtonMenuItem Eric = new JRadioButtonMenuItem(new IciQui2("Eric"));
		JRadioButtonMenuItem Alexis = new JRadioButtonMenuItem(new IciQui3("Alexis"));
		JMenu auteur1 = new JMenu("auteur");
		JMenuItem rouge = new JMenuItem(new IciRouge("rouge"));
		JMenuItem vert= new JMenuItem(new IciVert("vert"));
		JMenuItem jaune = new JMenuItem(new IciJaune("jaune"));
		JMenuItem bleu = new JMenuItem(new IciBleu("bleu"));
		JMenuItem reset = new JMenuItem(new IciReset("gris"));
		JMenuItem penduA = new JMenuItem(new IciPen("Pendu aveugle ?"));
		JMenuItem ou = new JMenuItem(new Iciou("Casse t�te?"));
		JButton pendu = new JButton(new IciPendu("Pendu Aveugle"));
		JButton Carte = new JButton(new IciCarte("Casse t�te?"));
		JButton Quiz = new JButton(new IciQuiz("Quiz vari�"));
        ImageIcon icon = new ImageIcon(new ImageIcon("C:/PIHM/moi.jpg").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
        ImageIcon icon2 = new ImageIcon(new ImageIcon("C:/PIHM/pendu.jpg").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
        ImageIcon icon3 = new ImageIcon(new ImageIcon("C:/PIHM/loupe.jpg").getImage().getScaledInstance(70, 150, Image.SCALE_DEFAULT));
        boolean com=false;
        boolean com2=false;
        boolean com3=false;
        

		
		public Accueil(){
			super();
			build();
			init();
			setContentPane(panel);
			setVisible(true);
			
		}
		
		private void build(){
			setTitle("accueil");
			setSize(400,200);
			setLocationRelativeTo(null);
			setResizable(true);		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			
		}
		
		private void init(){
			panel.setLayout(new BorderLayout());
			panel2.setLayout(new BorderLayout());
			panel.add(menuBar);
			couleur.add(rouge);
			couleur.add(vert);
			couleur.add(bleu);
			couleur.add(jaune);
			couleur.add(reset);		
			auteur1.add(davy);
			auteur1.add(Alexis);
			auteur1.add(Eric);
			auteur.add(auteur1);
			musique.add(mus);
			musique.add(sardine);
			musique.add(kalash);
			regle.add(penduA);
			regle.add(ou);
			menuBar.add(couleur);
			menuBar.add(musique);
			menuBar.add(regle);
			menuBar.add(auteur);
			setJMenuBar(menuBar);
			panel3.add(choix);
			panel.add(panel3,BorderLayout.NORTH);
			panel4.add(pendu);
			panel5.add(Carte);
			panel6.add(Quiz);
			panel2.add(panel4,BorderLayout.NORTH);
			panel2.add(panel5,BorderLayout.CENTER);
			panel2.add(panel6,BorderLayout.SOUTH);
			panel.add(panel2,BorderLayout.CENTER);	
			}			
	

		
		
public class Icimusique extends AbstractAction{
			
			public Icimusique(String texte){
				super(texte);
			}

			@Override
                        public void actionPerformed(ActionEvent e) {
                                Musique son = new Musique();
                        }	
		}

public class Iciplayliste extends AbstractAction{
			
			public Iciplayliste(String texte){
				super(texte);
			}

			@Override
                        public void actionPerformed(ActionEvent e) {
                                Musique son = new Musique();
                        }	
		}


		
	public class IciRouge extends AbstractAction{
			
			public IciRouge(String texte){
				super(texte);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);	
				panel2.setBackground(Color.RED);	
				panel3.setBackground(Color.RED);	
				panel4.setBackground(Color.RED);	
				panel5.setBackground(Color.RED);
				panel6.setBackground(Color.RED);
				choix.setText("<html><body><font color='white'>A quoi voulez-vous jouer ?</body></html>");
				choix.setToolTipText(choix.getText());

			}	
		}
	
	
	public class IciVert extends AbstractAction{
		
		public IciVert(String texte){
			super(texte);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.GREEN);	
			panel2.setBackground(Color.GREEN);	
			panel3.setBackground(Color.GREEN);	
			panel4.setBackground(Color.GREEN);	
			panel5.setBackground(Color.GREEN);
			panel6.setBackground(Color.GREEN);


		}	
	}
		
		
	public class IciJaune extends AbstractAction{
		
		public IciJaune(String texte){
			super(texte);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.YELLOW);	
			panel2.setBackground(Color.YELLOW);	
			panel3.setBackground(Color.YELLOW);	
			panel4.setBackground(Color.YELLOW);	
			panel5.setBackground(Color.YELLOW);
			panel6.setBackground(Color.YELLOW);
			choix.setText("<html><body><font color='black'>A quoi voulez-vous jouer ?</body></html>");
			choix.setToolTipText(choix.getText());

		}	
	}
		
	
	public class IciBleu extends AbstractAction{
		
		public IciBleu(String texte){
			super(texte);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.BLUE);	
			panel2.setBackground(Color.BLUE);	
			panel3.setBackground(Color.BLUE);	
			panel4.setBackground(Color.BLUE);	
			panel5.setBackground(Color.BLUE);
			panel6.setBackground(Color.BLUE);

			choix.setText("<html><body><font color='white'>A quoi voulez-vous jouer ?</body></html>");
			choix.setToolTipText(choix.getText());
			
		}	
	}
	
	
public class IciReset extends AbstractAction{
		
		public IciReset(String texte){
			super(texte);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.GRAY);	
			panel2.setBackground(Color.GRAY);	
			panel3.setBackground(Color.GRAY);	
			panel4.setBackground(Color.GRAY);	
			panel5.setBackground(Color.GRAY );	
			panel6.setBackground(Color.GRAY);

		}	
	}
		


public class IciPendu extends AbstractAction{
	
	public IciPendu(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JeuPendu pendre = new JeuPendu();
	}	
}

public class IciCarte extends AbstractAction{
	
	public IciCarte(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Pair cartes = new Pair();
	}	
}


public class IciQuiz extends AbstractAction{
	
	public IciQuiz(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		QUIZ qui = new QUIZ();
	}	
}


public class IciPen extends AbstractAction{
	
	public IciPen(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "le but du jeu est le m�me que"
				+ "\n celui du pendu classique sauf que nous ne devoilons pas la position "
				+ "\ndes lettres dans le mots.","Regle Pendu Aveugle", JOptionPane.INFORMATION_MESSAGE, icon2);
	}	
}


public class Iciou extends AbstractAction{
	
	public Iciou(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "le but du jeu est de trouver la couleur correspondand � celle afficher en fond d'�cran,"
				+ " c'est un jeu de memoire o� il faut memoriser la position des couleur dans chaque case,"
				+ " � chaque bonne reponse votre compteur augmente mais � la moindre erreur le jeu se termine et "
				+ "rebelote.","Regle Casse t�te ?", JOptionPane.INFORMATION_MESSAGE, icon3);
	}	
}

public class IciQui extends AbstractAction{
	
	public IciQui(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Etudiant en DUT informtique � l'IUT lyon 1"
				+ "\nDibandi Davy"
				+ "\nn�e � Fort-De-France"
				+ "\nle 03/11/1997 ", "Auteur", JOptionPane.INFORMATION_MESSAGE, icon);

	}	
}

public class IciQui3 extends AbstractAction{
	
	public IciQui3(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Etudiant en DUT informtique � l'IUT lyon 1"
				+ "\nAlexis Garcia"
				+ "\nn�e � Vienne"
				+ "\nle 26/07/1997 ", "Auteur", JOptionPane.INFORMATION_MESSAGE);

	}	
}


public class IciQui2 extends AbstractAction{
	
	public IciQui2(String texte){
		super(texte);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Etudiant en DUT informtique � l'IUT lyon 1"
				+ "\nEric Bayundo Davy"
				+ "\nn�e � Rouanda"
				+ "\nle 03/11/1997 ", "Auteur", JOptionPane.INFORMATION_MESSAGE);

	}	
}

		

	}



