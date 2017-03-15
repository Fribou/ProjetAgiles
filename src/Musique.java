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
import java.io.File;
import java.util.ArrayList;
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
/**
 *
 * @author N. Desmarais
 */
public class Musique extends JFrame {
    
    JPanel Principale = new JPanel();
    JComboBox liste = new JComboBox();
    File name = new File("C:\\Users\\N. Desmarais\\Desktop\\ProjetAgile\\Musique"); 
    String [] test;
    
    
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
        Principale.add(liste,BorderLayout.CENTER);
        
	
		
    }
    
        public String [] listerRepertoire(File repertoire){ 
            String [] listefichiers; 

            int i; 
            listefichiers=repertoire.list();
            return (listefichiers);
        } 
}


