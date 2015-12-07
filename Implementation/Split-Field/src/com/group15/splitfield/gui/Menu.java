package com.group15.splitfield.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;

public abstract class Menu extends JPanel{

	JButton back;
	public Menu() {
		
		setSize(new Dimension(1300,700));
		
		//getRootPane().setBackground( new Color(0,0,0));
		this.setBackground(new Color(0,0,0));

		setLayout( null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setResizable (false);
		setVisible(true);

	}
}