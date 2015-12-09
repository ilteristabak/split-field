package com.group15.splitfield.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JLabel;

public class HelpMenu extends Menu{
	JLabel header;
	JLabel header2;
	JLabel content1;
	JLabel content2;
	JLabel content3;
	
	
	public HelpMenu() {
		super.back = new JButton("Back");
		header = new JLabel("Help");
		header2 = new JLabel("How to play?");
		content1 = new JLabel("Move: Key Arrows");
		content2 = new JLabel("StartCut: Space");
		content3 = new JLabel("LaserCut: Z");
		super.back.setActionCommand("back");
		header.setFont( new Font("Arial", 0, 80));
		header2.setFont( new Font("Arial", 0, 40));
		content1.setFont( new Font("Arial", 0, 40));
		content2.setFont( new Font("Arial", 0, 40));
		content3.setFont( new Font("Arial", 0, 40));
		
		back.setPreferredSize( new Dimension((int)getSize().getWidth()/12,(int)getSize().getHeight()/12));
		//back.addActionListener(new ButtonListener());
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.setFont(new Font("Arial", 0, 20));
		back.setFocusPainted(false);
		back.setForeground(new Color(240,13,13));
		
		add(header);
		add(header2);
		add(content1);
		add(content2);
		add(content3);
		add(back);
		Insets insets = getInsets();
			
		header.setForeground(Color.white);
		header2.setForeground(Color.red);
		content1.setForeground(Color.red);
		content2.setForeground(Color.red);
		content3.setForeground(Color.red);
		
		Dimension size = header.getPreferredSize();
		header.setBounds((int)getSize().getWidth()/3+50 + insets.left, 50 + insets.top,
		             size.width, size.height);
		
		size = header2.getPreferredSize();
		header2.setBounds((int)getSize().getWidth()/3+50 + insets.left, 150 + insets.top,
		             size.width, size.height);
		
		size = content1.getPreferredSize();
		content1.setBounds((int)getSize().getWidth()/3+50 + insets.left, 250 + insets.top,
		             size.width, size.height);
		
		size = content2.getPreferredSize();
		content2.setBounds((int)getSize().getWidth()/3+50 + insets.left, 350 + insets.top,
		             size.width, size.height);
		size = content3.getPreferredSize();
		content3.setBounds((int)getSize().getWidth()/3+50 + insets.left, 450 + insets.top,
		             size.width, size.height);
		size = back.getPreferredSize();
		back.setBounds(10 + insets.left, 10 + insets.top,
		             size.width, size.height);
	}
	public Queue<JButton> getButtons(){
		Queue<JButton> q = new LinkedList<JButton>();
		q.add(super.back);
		return q;
	}
}