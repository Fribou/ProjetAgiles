import interfacedivertissement.AccueilQuiz;
import java.awt.*;
import static java.awt.BorderLayout.CENTER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import jeucouleur.JeuCouleur;

public class NewAccueil extends JFrame implements ActionListener {
    
    JButton jeu1;
    JButton jeu2;
    JButton jeu3;
    JButton jeu4;
    
    public NewAccueil() {
        
        try {
            this.setContentPane(new JPanel() {
                BufferedImage image = ImageIO.read(new File("./src/images/menuBackground.jpg"));
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, 800, 600, this);
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(NewAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        addComponentsToPane(this.getContentPane());
        
        // Création de la fenêtre
        this.setTitle("Davy déosgames : Et oui monsieur, j'ai de l'humour");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.setResizable(false);
        this.setVisible(true);
        jeu1.addActionListener(this);
        jeu2.addActionListener(this);
        jeu3.addActionListener(this);
        jeu4.addActionListener(this);
     }
    
    public void addComponentsToPane(Container pane) {
        pane.setLayout(null);

        jeu1 = new JButton("Pendu");
        jeu2 = new JButton("Casse-tête");
        jeu3 = new JButton("Quizz");
        jeu4 = new JButton("Color Game");
        
        JButton musique1 = new JButton("Musiques et playlists");
        JButton musique2 = new JButton("Créer une playlist");
        JButton musique3 = new JButton("Modifier une playlist");
        JButton musique4 = new JButton("Importer une musique");
        
        pane.add(jeu1);
        pane.add(jeu2);
        pane.add(jeu3);
        pane.add(jeu4);
        
        pane.add(musique1);
        pane.add(musique2);
        pane.add(musique3);
        pane.add(musique4);

        Insets insets = pane.getInsets();
        Dimension size = null;
        
        size = jeu1.getPreferredSize();
        jeu1.setBounds(150 + insets.left,200 + insets.top,150, 50);
        size = jeu2.getPreferredSize();
        jeu2.setBounds(150 + insets.left, 300 + insets.top, 150,50);
        size = jeu3.getPreferredSize();
        jeu3.setBounds(500 + insets.left, 200 + insets.top,150,50);
        size = jeu4.getPreferredSize();
        jeu4.setBounds(500 + insets.left, 300 + insets.top,150,50);
        
        size = musique1.getPreferredSize();
        musique1.setBounds(0 + insets.left,535 + insets.top,200, 30);
        size = musique2.getPreferredSize();
        musique2.setBounds(200 + insets.left,535 + insets.top, 200,30);
        size = musique3.getPreferredSize();
        musique3.setBounds(400 + insets.left,535 + insets.top,200,30);
        size = musique4.getPreferredSize();
        musique4.setBounds(600 + insets.left,535 + insets.top,200,30);
        
        
    }
     public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
 
		if(source == jeu3){
			new AccueilQuiz().setVisible(true);
                        
                                }
                else if(source == jeu4){
			JeuCouleur.main();
                        
		}
                else if(source == jeu1){
			JeuPendu p = new JeuPendu();
                        
		}
                else {
			Pair p = new Pair();
                        
		}
                
	}
 
}
