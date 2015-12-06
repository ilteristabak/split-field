package com.group15.splitfield.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Queue;

import javax.swing.JButton;

public class GameController implements ActionListener, KeyListener {

	private FileManagerForSave fileManager;
	private GameScreenManager screenManager;
	private BackgroundManager backgroundManager;
	
	
	public GameController(String saveLoadFileDirectory, String saveLoadFileName){
		fileManager = new FileManagerForSave(saveLoadFileDirectory, saveLoadFileName);
		screenManager = new GameScreenManager();
		Queue<JButton> listOfButtons = screenManager.setCurrentPanelHolder("mainMenu");
		while(!listOfButtons.isEmpty()){
			listOfButtons.remove().addActionListener(this);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("saveGame")){
			
		}
		else if(e.getActionCommand().equals("newGame")){
			screenManager.setCurrentPanelHolderFor("new").addKeyListener(this);
		}
		else if(e.getActionCommand().equals("loadGame")){
			screenManager.setCurrentPanelHolderFor("load").addKeyListener(this);
		}
		else{
			Queue<JButton> listOfButtons = screenManager.setCurrentPanelHolder(e.getActionCommand());
			while(!listOfButtons.isEmpty()){
				listOfButtons.remove().addActionListener(this);
			}
		}
	}

}
