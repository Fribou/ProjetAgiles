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
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

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
    File name = new File("Musique");
    File playliste = new File("Playliste"); 
    String [] test;
    JButton lec = new JButton(new Icilecture("Lecture"));
    JButton lecplay = new JButton(new IcilecturePlay("Lecture"));
    int Lecture = 0;
    int lectureplay = 0;
    
    
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
        File sound = null;
        AudioInputStream audioIn = null;
        Clip clipMusique;
        
        public Icilecture(String text){
            super(text);
        }

        @Override
        public void actionPerformed(ActionEvent e){
            if(Lecture ==0){
                sound = new File("Musique/"+(String)liste.getSelectedItem());
                try {
                    audioIn = AudioSystem.getAudioInputStream(sound);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    clipMusique = AudioSystem.getClip();
                    clipMusique.open(audioIn);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                }
                clipMusique.start();
                Lecture = 1;
                lec.setText("Stop");
            }
            else{
                Lecture = 0;
                clipMusique.stop();
                lec.setText("Lecture");
            }
        }
    
    }
    
    
    public class IcilecturePlay extends AbstractAction{
        File soundPlay = null;
        AudioInputStream audioInPlay = null;
        Clip clipPlayliste;
        Thread t = null;
        public IcilecturePlay(String text){
            super(text);
            try {
                clipPlayliste = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e){
            if(lectureplay == 0){
                lectureplay = 1;
                String liste = (String) play.getSelectedItem();
                InputStream flux;
                
               try {
                   flux = new FileInputStream("Playliste/"+liste);
                   InputStreamReader lecture=new InputStreamReader(flux);
                   BufferedReader buff=new BufferedReader(lecture);
                   ArrayList<String> musique = new ArrayList<>();
                   String test2;
                   while ((test2 = buff.readLine())!=null){
                                   soundPlay = new File("Musique/"+musique);
                                   musique.add(test2);
                   }

                   t = new Thread(){
                       public void run(){
                           int taille = musique.size();
                           int i;
                           for(i=0;i<taille;i++){
                               soundPlay = new File("Musique/"+musique.get(i));
                               try {
                                   audioInPlay = AudioSystem.getAudioInputStream(soundPlay);
                               } catch (UnsupportedAudioFileException ex) {
                                   Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                               } catch (IOException ex) {
                                   Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                               }

                               try {
                                   clipPlayliste.close();
                                   clipPlayliste.open(audioInPlay);
                               } catch (LineUnavailableException ex) {
                                   Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                               } catch (IOException ex) {
                                   Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
                               }
                               clipPlayliste.start();
                               Lecture = 1;
                               lecplay.setText("Stop");
                               while (clipPlayliste.isRunning()){

                               }
                           }
                       }
                   };
                   t.start();

                   buff.close();

               } catch (FileNotFoundException ex) {
                   Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
               } catch (IOException ex) {
                   Logger.getLogger(Musique.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
            else if(lectureplay == 1){
                t.stop();
                lectureplay = 0;
                lecplay.setText("Lecture");
                clipPlayliste.stop();
            }
        }
    }
}
    
   
