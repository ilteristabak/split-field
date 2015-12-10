package com.group15.splitfield.controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.group15.splitfield.entity.GameObject;
import com.group15.splitfield.entity.GameObjectFactory;
import com.group15.splitfield.entity.LineRider;

public class GameField extends JPanel implements ActionListener{

	private GameObjectFactory gameObjectFactory;
	private ArrayList<GameObject> gameObjectList;
	private LineRider lineRider;
	private Timer timer;
	private GameEngine gameEngine;
	private BackgroundManager backgroundManager;
	private int borderX;
	private int borderY;
	
	public GameField(GameEngine gameEngine){
		//super();
		borderX = 1400;
		borderY = 775;
		this.gameEngine = gameEngine;
		gameObjectList = new ArrayList<GameObject>();
		gameObjectFactory = new GameObjectFactory();
		setBackground(Color.WHITE);
		setSize(new Dimension(borderX,borderY));
		lineRider = new LineRider(689,774);
		setVisible(true);
		timer = new Timer(5,this);
		
	}
	public void addGameObjectToGameField(int i, int positionX, int positionY){
		gameObjectList.add(gameObjectFactory.getGameObject(i, positionX, positionY));
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0; i < gameObjectList.size(); i++){
			gameObjectList.get(i).draw(g);
		}
		lineRider.draw(g);
		for(int i = 0;i < 1400; i++) {
			for(int j = 0; j < 775; j++){
				if(backgroundManager.getPixels()[j][i] == 3){
					g.setColor(Color.BLUE);
					g.fillRect(i, j, 1, 1);
				}
				else if(backgroundManager.getPixels()[j][i] == 1){
					
					g.setColor(Color.BLACK);
					g.fillRect(i, j, 1, 1);
				}
				else if(backgroundManager.getPixels()[j][i] == 2){
					g.setColor(Color.RED);
					g.fillRect(i, j, 1, 1);
				}
			}
		}
		
	}
	public void updatePosition(int x, int y){
		lineRider.updatePosition(lineRider.getPositionX()+x,lineRider.getPositionY()+y);
	}
	public LineRider getLineRider(){
		return lineRider;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		routine();
	}
	public void pauseGame(){
			timer.stop();
	}
	public void continueGame(){
		timer.restart();
	}
	public void startGame(){
		timer.start();
	}
	public void setBackgroundManager(BackgroundManager backgroundManager){
		this.backgroundManager = backgroundManager;
		lineRider.setBackgroundManager(backgroundManager);
		for(int i = 0; i < gameObjectList.size(); i++){
			gameObjectList.get(i).setGameField(this);
		}
	}
	public void routine(){
		for(int i = 0; i < gameObjectList.size(); i++){
			gameObjectList.get(i).updatePosition();
		}
		repaint();
	}
	
	public BackgroundManager getBackgroundManager(){
		return backgroundManager;
	}
	public void collision(){
		lineRider.decrementNoOfLives();
		lineRider.updateDirectPosition(backgroundManager.getInitialPoint().x, backgroundManager.getInitialPoint().y);
		backgroundManager.destroyLine();
		repaint();
		//decrement life
		// start line rider from initial point
	}
	
}
