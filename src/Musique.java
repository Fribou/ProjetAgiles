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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
public class Musique extends JFrame {
    
    JPanel Principale = new JPanel();
    JPanel panelMus = new JPanel();
    JPanel panelPlay = new JPanel();
    JComboBox liste = new JComboBox();
    JComboBox play = new JComboBox();
    File name = new File("C:/Users/N. Desmarais/Desktop/ProjetAgile/Musique");
    File playliste = new File("C:/Users/N. Desmarais/Desktop/ProjetAgile/Playliste"); 
    String [] test;
    JButton lec = new JButton(new Icilecture("Lecture/Stop"));
    JButton lecplay = new JButton(new IcilecturePlay("Lecture/Stop"));
    int Lecture = 0;
    
    
    public Musique(){
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
        
        test = listerRepertoire(name);
        int i;
        for(i=0;i<test.length;i++){ 
            liste.addItem(test[i]);
        } 
        test = listerRepertoire(playliste);
        for(i=0;i<test.length;i++){ 
            play.addItem(test[i]);
        } 
        panelMus.add(liste,BorderLayout.CENTER);
        panelMus.add(lec,BorderLayout.CENTER);
        panelPlay.add(play,BorderLayout.CENTER);
        panelPlay.add(lecplay,BorderLayout.CENTER);
        
        Principale.add(panelMus,BorderLayout.NORTH);
        Principale.add(panelPlay,BorderLayout.SOUTH);
        
	
		
    }
    
        public String [] listerRepertoire(File repertoire){ 
            String [] listefichiers; 

            int i; 
            listefichiers=repertoire.list();
            return (listefichiers);
        }
        
    public Object GetMusique(){
        return(liste.getSelectedItem());
    }
    
    public class Icilecture extends AbstractAction{
        Audio son = new Audio(liste.getSelectedItem());
        public Icilecture(String text){
            super(text);
        }

        @Override
        public void actionPerformed(ActionEvent e){
            if(Lecture ==0){
                son = new Audio(liste.getSelectedItem());
                Lecture = 1;
                son.start();
            }
            else{
                Lecture = 0;
                son.stop();
            }
        }
    
    }
    public class IcilecturePlay extends AbstractAction{
        String son = (String) play.getSelectedItem();
        public IcilecturePlay(String text){
            super(text);
        }

        @Override
        public void actionPerformed(ActionEvent e){
             String son = (String) play.getSelectedItem();
             InputStream flux;
             AudioPlay teste = null;
             Thread t = null;
            try {
                flux = new FileInputStream("C:/Users/N. Desmarais/Desktop/ProjetAgile/Playliste/"+son);
                InputStreamReader lecture=new InputStreamReader(flux);
                BufferedReader buff=new BufferedReader(lecture);
                
                 
                if(Lecture ==0){
                    t = new Thread((Runnable) (teste = new AudioPlay(buff)));
                    Lecture = 1;
                    t.start();
                }
                else{
                    Lecture = 0;
                    t.stop();
                }
                
                buff.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             
        }
    }
    
   
}
