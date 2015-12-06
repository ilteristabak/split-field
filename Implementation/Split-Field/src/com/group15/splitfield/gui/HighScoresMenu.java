package com.group15.splitfield.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HighScoresMenu extends Menu{
	
	JLabel logo;
	String holdersList[];
	double highScoresList[];
	
	public HighScoresMenu() {
		
		// GUI
		super.back = new JButton("Back");
		logo = new JLabel("High Scores");
		back.setActionCommand("back");
		add(logo);
		add(back);
		
		logo.setForeground(new Color(255,255,255));
		logo.setFont( new Font("Arial", 0, 80));

		back.setPreferredSize( new Dimension((int)getSize().getWidth()/12,(int)getSize().getHeight()/12));
		//back.addActionListener(new ButtonListener());
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.setFont(new Font("Arial", 0, 20));
		back.setFocusPainted(false);
		back.setForeground(new Color(240,13,13));
		
		
		Insets insets = getInsets();
		Dimension size = logo.getPreferredSize();
		logo.setBounds((int)getSize().getWidth()/3 + insets.left, 50 + insets.top,
		             size.width, size.height);
		size = back.getPreferredSize();
		back.setBounds(10 + insets.left, 10 + insets.top,
		             size.width, size.height);
		
		// GET FROM FILE MANAGER
		int sizex = 3;
		// initialize array!!!!!!!!!!!!!!!!!
		holdersList = new String[sizex];
		highScoresList = new double[sizex];
		holdersList[0] ="dsafasdf";
		holdersList[1] ="dsfaas";
		holdersList[2] ="dscdsc";
		highScoresList[0]=300;
		highScoresList[1]=400;
		highScoresList[2]=500;
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.cyan);
		int fontSize= 40;
		g.setFont(new Font("Arial", 0, fontSize) );
		
		for(int i = 0; i < holdersList.length;i++) {
			g.drawString(String.format("%10s",(i+1)+") "+holdersList[i] +"\t" +highScoresList[i]), 400, 200+i*100+fontSize);
		}
		
	}
	public Queue<JButton> getButtons(){
		Queue<JButton> q = new LinkedList<JButton>();
		q.add(super.back);
		return q;
	}
}