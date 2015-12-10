package com.group15.splitfield.controller;


import java.awt.Color;
import java.awt.Dimension;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.group15.splitfield.gui.*;

public class GameScreenManager extends JFrame {
	
	private Object currentPanel;
	private Object pausePanel;
	
	//constructor
	public GameScreenManager(){
		setSize(new Dimension(1400,800));
		getContentPane().setBackground(new Color(0,0,0));
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	//methods
	public Queue<JButton> setCurrentPanelHolder(String s){
		if(s.equals("choosePlayType")){
			remove((MainMenu)currentPanel);
			currentPanel = new ChoosePlayTypeMenu();
			add((ChoosePlayTypeMenu)currentPanel);
			((ChoosePlayTypeMenu)currentPanel).repaint();
			return ((ChoosePlayTypeMenu)currentPanel).getButtons();
		}
		if(s.equals("mainMenu")){
			currentPanel = new MainMenu();
			add((MainMenu)currentPanel);
			((MainMenu)currentPanel).repaint();
			return ((MainMenu)currentPanel).getButtons();
		}
		else if(s.equals("highScores")){
			remove((MainMenu)currentPanel);
			currentPanel = new HighScoresMenu();
			add((HighScoresMenu)currentPanel);
			((HighScoresMenu)currentPanel).repaint();
			return ((HighScoresMenu)currentPanel).getButtons();
		}
		else if(s.equals("help")){
			remove((MainMenu)currentPanel);
			currentPanel = new HelpMenu();
			add((HelpMenu)currentPanel);
			((HelpMenu)currentPanel).repaint();
			return ((HelpMenu)currentPanel).getButtons();
		}
		else if(s.equals("exit")){
			remove((MainMenu)currentPanel);
			System.exit(0);
			return null;
		}
		else if(s.equals("exitFromInGame")){
			remove((InGameMenu)currentPanel);
			System.exit(0);
			return null;
		}
		else if(s.equals("back")){
			if(currentPanel.getClass().getName().equals("com.group15.splitfield.gui.ChoosePlayTypeMenu")){
				remove((ChoosePlayTypeMenu)currentPanel);
				currentPanel = new MainMenu();
			}
			else if(currentPanel.getClass().getName().equals("com.group15.splitfield.gui.HighScoresMenu")){
				remove((HighScoresMenu)currentPanel);
				currentPanel = new MainMenu();
			}
			else if(currentPanel.getClass().getName().equals("com.group15.splitfield.gui.HelpMenu")){
				remove((HelpMenu)currentPanel);
				currentPanel = new MainMenu();
			}
			add((MainMenu)currentPanel);
			((MainMenu)currentPanel).repaint();
			return ((MainMenu)currentPanel).getButtons();
		}
		else if(s.equals("pause")){
			pausePanel = currentPanel;
			//((GameEngine)pausePanel).pauseGame();
			((GameEngine)pausePanel).setVisible(false);
			// GameEngine'in içindeki gameLoopu durdur.
			currentPanel = new InGameMenu();
			add((InGameMenu)currentPanel);
			((InGameMenu)currentPanel).repaint();
			return ((InGameMenu)currentPanel).getButtons();
		}
		else if(s.equals("continueGame")){
			remove((InGameMenu)currentPanel);
			currentPanel = pausePanel;
			((GameEngine)currentPanel).setVisible(true);
			add((GameEngine)currentPanel);
			((GameEngine)currentPanel).repaint();
			// GameEngine'in içindeki gameLoopu devam ettir.
			//((GameEngine)currentPanel).continueGame();
			return null;
		}
		else if(s.equals("returnToMainMenu")){
			remove((InGameMenu)currentPanel);
			currentPanel = null;
			remove((GameEngine)pausePanel);
			pausePanel = null;
			currentPanel = new MainMenu();
			add((MainMenu)currentPanel);
			((MainMenu)currentPanel).repaint();
			return ((MainMenu)currentPanel).getButtons();
		}
		else
			return null;
	}
	public GameEngine setCurrentPanelHolderFor(String s){
		if(s.equals("new")){
			remove((ChoosePlayTypeMenu)currentPanel);
			currentPanel = new GameEngine("new"); // Level buradan belirlenecek
			add((GameEngine)currentPanel);
			((GameEngine)currentPanel).repaint();
			this.repaint();
			return (GameEngine)currentPanel;
		}
		else{
			remove((ChoosePlayTypeMenu)currentPanel);
			currentPanel = new GameEngine("load"); // Level buradan belirlenecek
			add((GameEngine)currentPanel);
			((GameEngine)currentPanel).repaint();
			return (GameEngine)currentPanel;
		}
	}
	public void closeFrames(){
		
	}
	public GameEngine getGameEngine(){
		return ((GameEngine)this.currentPanel);
	}
	
}
