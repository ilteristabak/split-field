package com.group15.splitfield.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationField extends JPanel {
	private JLabel noOfLivesLabel;
	private JLabel scoreLabel;
	
	public InformationField(){
		//super();
		noOfLivesLabel = new JLabel("LIVE : 3");
		scoreLabel = new JLabel("SCORE : 0");
		noOfLivesLabel.setSize(new Dimension(650,100));
		scoreLabel.setSize(new Dimension(650,100));
		
		setBackground(Color.GREEN);
		//setSize(new Dimension(1300,100));
		noOfLivesLabel.setBackground(Color.MAGENTA);
		
		
		//setLayout(new BorderLayout(0,0));
		add(noOfLivesLabel);
		add(scoreLabel);
		setVisible(true);
	}
}
