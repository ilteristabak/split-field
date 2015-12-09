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
		borderX = 1300;
		borderY = 700;
		this.gameEngine = gameEngine;
		gameObjectList = new ArrayList<GameObject>();
		gameObjectFactory = new GameObjectFactory();
		setBackground(Color.BLACK);
		setSize(new Dimension(borderX,borderY));
		lineRider = new LineRider(650,667);
		setVisible(true);
		timer = new Timer(10,this);
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
	}
	public void routine(){
		for(int i = 0; i < gameObjectList.size(); i++){
			gameObjectList.get(i).updatePosition();
		}
		repaint();
	}
	public void decrementGameFieldBy(int x, int y){
		for(int i = 0; i < gameObjectList.size(); i++){
			gameObjectList.get(i).updateBorders(0, x,0,y);
		}
	}
	
	
}
