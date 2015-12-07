package com.group15.splitfield.controller;

import javax.swing.JPanel;

public class GameEngine extends JPanel {

	private int score;
	private int currentLevel[][];
	private int currentLevelNo;
	private LevelManager levelManager;
	private FileManagerForLoad fileManager;
	
	public GameEngine(String chooseType) {
		// TODO Auto-generated constructor stub
		levelManager = new LevelManager("");
		score = 0;
		if(chooseType.equals("new")){
			
		}
		
		else{
			
		}
	}

}
