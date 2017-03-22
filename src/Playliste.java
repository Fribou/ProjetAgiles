/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
	import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
	import javax.swing.JTextField;
/**
 *
 * @author N. Desmarais
 */
public class Playliste extends JFrame {
    
    JPanel Principale = new JPanel();
    JPanel un = new JPanel();
    JPanel deux = new JPanel();
    JLabel liste = new JLabel("Titre");
    JTextField test = new JTextField(20);
    File name = new File("C:/Users/N. Desmarais/Desktop/ProjetAgile/Playliste/"); 
    JButton lec = new JButton(new IciAjout("créé"));
    int Lecture = 0;
    
    
    public Playliste(){
		super();
		build();
                init();
		setContentPane(Principale);
		setVisible(true);
	}
    private void build(){	
		setTitle("Musique");
		setSize(300,150);
		setLocationRelativeTo(null);
		setResizable(true);		
    //    setContentPane(new ImagePanel(new ImageIcon("C:/pendu.jpg").getImage()));
		
	}
    
    private void init(){
        
        un.add(liste,BorderLayout.CENTER);
        un.add(test,BorderLayout.CENTER);
        deux.add(lec,BorderLayout.EAST);
        Principale.add(un,BorderLayout.NORTH);
        Principale.add(deux,BorderLayout.SOUTH);
        
	
		
    }
    
    public class IciAjout extends AbstractAction{
        public IciAjout(String text){
            super(text);
        }

        @Override
        public void actionPerformed(ActionEvent e){
            String title = test.getText();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Playliste/"+title)));
            } catch (IOException ex) {
                Logger.getLogger(Playliste.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    
    }
    
   

