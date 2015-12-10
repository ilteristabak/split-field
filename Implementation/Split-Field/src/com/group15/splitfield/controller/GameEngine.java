package com.group15.splitfield.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

import com.group15.splitfield.entity.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameEngine extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int score;
	private int currentLevel[][];
	private int currentLevelNo;
	private GameField gameField;
	private InformationField informationField;
	private LevelManager levelManager;
	private FileManagerForLoad fileManager;
	
	public GameEngine(String chooseType) {
		// TODO Auto-generated constructor stub
		//super();
		levelManager = new LevelManager("levels.txt");
		score = 0;
		gameField = new GameField(this);
		//informationField = new InformationField();
		setSize(new Dimension(1400,800));
		setLayout(null);
		//setLayout(new BorderLayout());
		//informationField.revalidate();
		//informationField.repaint();
		gameField.revalidate();
		gameField.repaint();
		
		//add(informationField,BorderLayout.SOUTH);
		add(gameField, BorderLayout.CENTER);
		
		
		
		
		
		this.setBackground(Color.BLACK);
		setVisible(true);
		
		
		if(chooseType.equals("new")){
			currentLevel = levelManager.takeCurrentLevel(currentLevelNo);
		}
		else{
			fileManager = new FileManagerForLoad("lastSave.txt");
			try {
				currentLevelNo = fileManager.getLastLevel();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				currentLevelNo = 0;
			} finally{
				currentLevel = levelManager.takeCurrentLevel(currentLevelNo);
			}
		}
		for(int i = 0; i < 8;i++){
			int number = currentLevel[0][i];
			for(int j = 0; j < number*2 - 1; j+=2){
				int positionX = currentLevel[j+1][i];
				int positionY = currentLevel[j+2][i];
				gameField.addGameObjectToGameField(i, positionX, positionY);
			}
		}
		
		gameField.startGame();
	}
	public void pauseGame(){
		gameField.pauseGame();
	}
	public void continueGame(){
		gameField.continueGame();
	}
	public void incrementScoreBy(int increment){
		score += increment;
	}
	public void setBackgroundManager(BackgroundManager backgroundManager){
		gameField.setBackgroundManager(backgroundManager);
	}
	public void addKeyListenerToGameEngine(GameController controller){
		addKeyListener(controller);
	}
	
	public void updatePosition(int x, int y){
		gameField.updatePosition(x, y);
	}
	public GameField getGameField(){
		return gameField;
	}
}
