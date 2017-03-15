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
}
