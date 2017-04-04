/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeucouleur;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import jeucouleur.StartAction.CouleurEnum;

/**
 *
 * @author p1502985
 */
public class Window extends JFrame {
    
    JPanel MainPanel;
    JPanel Panels[];
    JPanel Couleurs[];
    
    JButton Start;
    JButton ColorButtons[];
    
    //affichage info
    JLabel gameLevel;
    JLabel gameStatus;
    JLabel num;
    
    //info sur la partie
    boolean waintingResponse = false;
    int posSequ = 0;
    int level=0;
    //la liste de des couleur (solution)
    ArrayList<CouleurEnum> listReponse;
    
    
    Window(){
        initPanels();
        initComponent();
        initWindow();
    }
    
    
    private void initWindow(){
        
        this.add(MainPanel);
        this.setContentPane(MainPanel);
        this.setResizable(true);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Jeu des couleurs");

    }

    private void initPanels() {
        
        //main panel
        MainPanel = new JPanel();
        MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.PAGE_AXIS));
        
        //panels
        Panels = new JPanel[4];
        Panels[0] = new JPanel();
        Panels[1] = new JPanel();
        Panels[2] = new JPanel();
        Panels[3] = new JPanel();
        
        Panels[0].setBackground(Color.black);
        Panels[1].setBackground(Color.black);
        Panels[2].setBackground(Color.black);
        Panels[3].setBackground(Color.black);
        
        Panels[0].setPreferredSize(new Dimension(150,150));
        Panels[1].setPreferredSize(new Dimension(50,50));
        
        Panels[3].setLayout(new BorderLayout());
   
        MainPanel.add(Panels[0]);
        MainPanel.add(Panels[3]);
        MainPanel.add(Panels[1]);
        MainPanel.add(Panels[2]);
        
    }

    private void initComponent() {
        
        //initialisation des couleurs
        initColor();
        
        //bouton Start
        Start = new JButton();
        Start.setText("Start");
        Start.addActionListener(new StartAction(this));
        Panels[1].add(Start);
        
        //choix couleur
        initColorButtons();
        
        //info partie
        gameLevel = new JLabel("Level : " + level);
        gameStatus = new JLabel("Aucune partie en cour");
        num = new JLabel("0",JLabel.CENTER);
        
        gameLevel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        gameStatus.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        num.setFont(new Font("Comic Sans MS", Font.BOLD, 100));
        
        gameLevel.setForeground(Color.lightGray);
        gameStatus.setForeground(Color.lightGray);
        num.setForeground(Color.WHITE);
        
        gameLevel.setPreferredSize(new Dimension(300,100));
        gameStatus.setPreferredSize(new Dimension(300,100));
        
        Panels[3].add(gameLevel,BorderLayout.WEST);
        Panels[3].add(gameStatus,BorderLayout.EAST);
        Panels[3].add(num,BorderLayout.CENTER);
        
        
        
        
        
    }
    
    private void initColor(){
        Couleurs = new JPanel[4];
        
        Couleurs[0] = new JPanel();
        Couleurs[1] = new JPanel();
        Couleurs[2] = new JPanel();
        Couleurs[3] = new JPanel();
        
        //initialisation des couleurs
        Couleurs[0].setBackground(Color.RED);
        Couleurs[1].setBackground(Color.GREEN);
        Couleurs[2].setBackground(Color.BLUE);
        Couleurs[3].setBackground(Color.YELLOW);
        
       
        
        //taille par default
        Couleurs[0].setPreferredSize(new Dimension(100,100));
        Couleurs[1].setPreferredSize(new Dimension(100,100));
        Couleurs[2].setPreferredSize(new Dimension(100,100));
        Couleurs[3].setPreferredSize(new Dimension(100,100));
                
        //subpanel 0
        Panels[0].add(Couleurs[0]);
        Panels[0].add(Couleurs[1]);
        Panels[0].add(Couleurs[2]);
        Panels[0].add(Couleurs[3]);
    }

    private void initColorButtons() {
        
        ColorButtons = new JButton[4];
        
        ColorButtons[0] = new JButton();
        ColorButtons[1] = new JButton();
        ColorButtons[2] = new JButton();
        ColorButtons[3] = new JButton();
        
        ColorButtons[0].addActionListener(new ResponseAction(this));
        ColorButtons[1].addActionListener(new ResponseAction(this));
        ColorButtons[2].addActionListener(new ResponseAction(this));
        ColorButtons[3].addActionListener(new ResponseAction(this));
        
        ColorButtons[0].setText("RED");
        ColorButtons[1].setText("GREEN");
        ColorButtons[2].setText("BLUE");
        ColorButtons[3].setText("YELLOW");
        
        ColorButtons[0].setBorder(new MatteBorder(5, 5, 5, 5, Color.RED));
        ColorButtons[1].setBorder(new MatteBorder(5, 5, 5, 5, Color.GREEN));
        ColorButtons[2].setBorder(new MatteBorder(5, 5, 5, 5, Color.BLUE));
        ColorButtons[3].setBorder(new MatteBorder(5, 5, 5, 5, Color.YELLOW));
        
        ColorButtons[0].setPreferredSize(new Dimension(100,100));
        ColorButtons[1].setPreferredSize(new Dimension(100,100));
        ColorButtons[2].setPreferredSize(new Dimension(100,100));
        ColorButtons[3].setPreferredSize(new Dimension(100,100));
        
        ColorButtons[0].setEnabled(false);
        ColorButtons[1].setEnabled(false);
        ColorButtons[2].setEnabled(false);
        ColorButtons[3].setEnabled(false);
        
        Panels[2].add(ColorButtons[0]);
        Panels[2].add(ColorButtons[1]);
        Panels[2].add(ColorButtons[2]);
        Panels[2].add(ColorButtons[3]);
        
    }
    
}
