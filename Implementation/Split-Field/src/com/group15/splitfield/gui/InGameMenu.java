package com.group15.splitfield.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.*;


public class InGameMenu extends Menu{
	JLabel logo;
	JButton continueB;
	JButton save;
	JButton returnToMainMenu;
	JButton exit;
	
	public InGameMenu() {
		logo = new JLabel("In Game Menu");
		continueB = new JButton("Continue");
		save  = new JButton("Save");
		returnToMainMenu = new JButton("Return to Main Menu");
		exit = new JButton("Exit");
		
		continueB.setActionCommand("continueGame");
		save.setActionCommand("saveGame");
		returnToMainMenu.setActionCommand("returnToMainMenu");
		exit.setActionCommand("exitFromInGame");
		
		//setTitle("Main Menu");
		logo.setFont( new Font("Arial", 0, 80));
		continueB.setFont( new Font("Arial", 0, 40));
		save.setFont( new Font("Arial", 0, 40));
		returnToMainMenu.setFont( new Font("Arial", 0, 40));
		exit.setFont( new Font("Arial", 0, 40));
		
		continueB.setForeground(new Color(240,13,13));
		save.setForeground(new Color(240,13,13));
		returnToMainMenu.setForeground(new Color(240,13,13));
		exit.setForeground(new Color(240,13,13));
		logo.setForeground(new Color(255,255,255));
		
		continueB.setPreferredSize( new Dimension((int)getSize().getWidth()/3,(int)getSize().getHeight()/10));
		save.setPreferredSize( new Dimension((int)getSize().getWidth()/3,(int)getSize().getHeight()/10));
		returnToMainMenu.setPreferredSize( new Dimension((int)getSize().getWidth()/3,(int)getSize().getHeight()/10));
		exit.setPreferredSize( new Dimension((int)getSize().getWidth()/3,(int)getSize().getHeight()/10));
		
		save.setContentAreaFilled(false);
		save.setBorderPainted(false);
		save.setFocusPainted(false);
		
		continueB.setContentAreaFilled(false);
		continueB.setBorderPainted(false);
		continueB.setFocusPainted(false);
		
		returnToMainMenu.setContentAreaFilled(false);
		returnToMainMenu.setBorderPainted(false);
		returnToMainMenu.setFocusPainted(false);
		
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.setFocusPainted(false);
		
		
		add(logo);
		add(save);
		add(continueB);
		add(returnToMainMenu);
		add(exit);
		
		Insets insets = getInsets();
		
		Dimension size = logo.getPreferredSize();
		logo.setBounds((int)getSize().getWidth()/3 + insets.left, 50 + insets.top,
		             size.width, size.height);
		
		
		size = continueB.getPreferredSize();
		continueB.setBounds((int)getSize().getWidth()/3+50 + insets.left, 200 + insets.top,
		             size.width, size.height);
		
		size = save.getPreferredSize();
		save.setBounds((int)getSize().getWidth()/3+50 + insets.left, 300 + insets.top,
		             size.width, size.height);
		
		size = returnToMainMenu.getPreferredSize();
		returnToMainMenu.setBounds((int)getSize().getWidth()/3+50 + insets.left, 400 + insets.top,
		             size.width , size.height );
		size = exit.getPreferredSize();
		exit.setBounds((int)getSize().getWidth()/3+50 + insets.left, 500 + insets.top,
		             size.width , size.height );
		
	}
	public Queue<JButton> getButtons(){
		Queue<JButton> q = new LinkedList<JButton>();
		q.add(continueB);
		q.add(save);
		q.add(returnToMainMenu);
		q.add(exit);
		return q;
	}
	
}
