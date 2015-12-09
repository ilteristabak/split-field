package com.group15.splitfield.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HighScoresMenu extends Menu{
	
	JLabel logo;
	ArrayList<String> holdersList;
	ArrayList<Double> highScoresList;
	
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
		
	
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		getHighScoresList();
		g.setColor(Color.cyan);
		int fontSize= 40;
		g.setFont(new Font("Arial", 0, fontSize) );
		if(holdersList != null) {
			for(int i = 0; i < holdersList.size();i++) {
				g.drawString(String.format("%5s",(i+1)+") "+holdersList.get(i)+"   " +highScoresList.get(i)), 400, 200+i*100+fontSize);
			}
		}
	}
	public void getHighScoresList() {
		
		holdersList = new ArrayList<String>();
		highScoresList = new ArrayList<Double>();
		// TODO Auto-generated method stub
		String content = null;
	    File file = new File("highScores.txt"); 
	    FileReader reader = null;
	    try {
	        reader = new FileReader(file);
	        BufferedReader bReader = new BufferedReader(reader);
	        while(bReader!= null) {
	        	String objects = bReader.readLine();
	        	if(objects != null) {
		        	String[] highScoreEntity = objects.split(" ");
		        	holdersList.add(highScoreEntity[0]);
		        	highScoresList.add(Double.parseDouble(highScoreEntity[1]));
	        	}
	        	else
	        		break;
	        }// end of while
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if(reader !=null){try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
	    }
	}
	public Queue<JButton> getButtons(){
		Queue<JButton> q = new LinkedList<JButton>();
		q.add(super.back);
		return q;
	}
}