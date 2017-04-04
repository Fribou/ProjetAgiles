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
	import javax.swing.JTextField;
/**
 *
 * @author N. Desmarais
 */
public class ModifPlay extends JFrame {
    
    JPanel Principale = new JPanel();
    JComboBox listeMus = new JComboBox();
    JComboBox listeplay = new JComboBox();
    File musique = new File("Musique");
    File playliste = new File("Playliste");
    String [] test;
    JButton lec = new JButton(new IciAjout("Ajouter"));
    int Lecture = 0;
    
    
    public ModifPlay(){
		super();
		build();
                init();
		setContentPane(Principale);
		setVisible(true);
	}
    private void build(){	
		setTitle("Musique");
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(true);		
    //    setContentPane(new ImagePanel(new ImageIcon("C:/pendu.jpg").getImage()));
		
	}
    
    private void init(){
        
        test = listerRepertoire(musique);
        int i;
        for(i=0;i<test.length;i++){ 
            listeMus.addItem(test[i]);
        } 
        test = listerRepertoire(playliste);
        for(i=0;i<test.length;i++){ 
            listeplay.addItem(test[i]);
        } 
        Principale.add(listeplay,BorderLayout.CENTER);
        Principale.add(listeMus,BorderLayout.CENTER);
        Principale.add(lec,BorderLayout.CENTER);
        
	
		
    }
    
        public String [] listerRepertoire(File repertoire){ 
            String [] listefichiers; 

            int i; 
            listefichiers=repertoire.list();
            return (listefichiers);
        }
    
    public class IciAjout extends AbstractAction{
        public IciAjout(String text){
            super(text);
        }

        @Override
        public void actionPerformed(ActionEvent e){
            String play = (String) listeplay.getSelectedItem();
            String mus = (String) listeMus.getSelectedItem();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Playliste/"+play),true));
                writer.write(String.valueOf(mus)+"\n");
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Playliste.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
   
}
