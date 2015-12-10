package com.group15.splitfield.controller;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Queue;

import javax.swing.JButton;

public class GameController implements ActionListener, KeyListener {

	private FileManagerForSave fileManager;
	private GameScreenManager screenManager;
	private BackgroundManager backgroundManager;
	private boolean isSpacePressed;
	private ArrayList<Point> lineDrawn;
	private Point initialPosition;
	public GameController(String saveFileName,GameScreenManager screenManager,BackgroundManager backgroundManager){
		this.screenManager = screenManager;
		this.backgroundManager = backgroundManager;
		isSpacePressed = false;
		lineDrawn = new ArrayList<Point>();
		initialPosition = new Point();
		fileManager = new FileManagerForSave(saveFileName);
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
		if(isSpacePressed){
			if(e.getKeyCode() == 37){
				if((screenManager.getGameEngine().getGameField().getLineRider().getPositionX() - 1) <= 1399 && screenManager.getGameEngine().getGameField().getLineRider().getPositionY() + 0 <= 774 ){
					int x = screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithSpace(-1, 0);
					
						backgroundManager.addPointToLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX(), screenManager.getGameEngine().getGameField().getLineRider().getPositionY());
						Point p = new Point();
						p.x = screenManager.getGameEngine().getGameField().getLineRider().getPositionX();
						p.y = screenManager.getGameEngine().getGameField().getLineRider().getPositionY();
						lineDrawn.add(p);
						screenManager.getGameEngine().getGameField().getBackgroundManager().addToArrayList(p);
					
					
					
					if(x == 1){
						backgroundManager.cutBackground(lineDrawn);
						lineDrawn.clear();
					}
					if(x == 2){
						backgroundManager.removePointFromLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX() - 1, screenManager.getGameEngine().getGameField().getLineRider().getPositionY() - 1);
						lineDrawn.remove(lineDrawn.size() - 1);
					}
					screenManager.getGameEngine().getGameField().repaint();
					screenManager.getGameEngine().repaint();
					screenManager.repaint();
				}
				
			}
			if(e.getKeyCode() == 38){
				if((screenManager.getGameEngine().getGameField().getLineRider().getPositionX() + 0) <= 1399 && screenManager.getGameEngine().getGameField().getLineRider().getPositionY() - 1 <= 774 ){
					int x = screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithSpace(0, -1);
					
						backgroundManager.addPointToLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX(), screenManager.getGameEngine().getGameField().getLineRider().getPositionY());
						Point p = new Point();
						p.x = screenManager.getGameEngine().getGameField().getLineRider().getPositionX();
						p.y = screenManager.getGameEngine().getGameField().getLineRider().getPositionY();
						lineDrawn.add(p);
						screenManager.getGameEngine().getGameField().getBackgroundManager().addToArrayList(p);
					
					
					if(x == 1){
						backgroundManager.cutBackground(lineDrawn);
						lineDrawn.clear();
					}
					if(x == 2){
						backgroundManager.removePointFromLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX() - 1, screenManager.getGameEngine().getGameField().getLineRider().getPositionY() - 1);
						lineDrawn.remove(lineDrawn.size() - 1);
					}
					//System.out.println(x);
					screenManager.getGameEngine().getGameField().repaint();
					screenManager.getGameEngine().repaint();
					screenManager.repaint();
				}
				
				//System.out.println(p.y);
			}
			if(e.getKeyCode() == 39){
				if((screenManager.getGameEngine().getGameField().getLineRider().getPositionX() + 1) <= 1399 && screenManager.getGameEngine().getGameField().getLineRider().getPositionY() + 0 <= 774 ){
					int x = screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithSpace(1, 0);
					
						backgroundManager.addPointToLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX(), screenManager.getGameEngine().getGameField().getLineRider().getPositionY());
						Point p = new Point();
						p.x = screenManager.getGameEngine().getGameField().getLineRider().getPositionX();
						p.y = screenManager.getGameEngine().getGameField().getLineRider().getPositionY();
						lineDrawn.add(p);
						screenManager.getGameEngine().getGameField().getBackgroundManager().addToArrayList(p);
					
					
					if(x == 1){
						backgroundManager.cutBackground(lineDrawn);
						lineDrawn.clear();
					}
					if(x == 2){
						backgroundManager.removePointFromLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX() - 1, screenManager.getGameEngine().getGameField().getLineRider().getPositionY() - 1);
						lineDrawn.remove(lineDrawn.size() - 1);
					}
					screenManager.getGameEngine().getGameField().repaint();
					screenManager.getGameEngine().repaint();
					screenManager.repaint();
				}
				
			}
			if(e.getKeyCode() == 40){
				if((screenManager.getGameEngine().getGameField().getLineRider().getPositionX() + 0) <= 1399 && screenManager.getGameEngine().getGameField().getLineRider().getPositionY() + 1 <= 774 ){
					int x = screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithSpace(0, 1);
					
						backgroundManager.addPointToLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX(), screenManager.getGameEngine().getGameField().getLineRider().getPositionY());
						Point p = new Point();
						p.x = screenManager.getGameEngine().getGameField().getLineRider().getPositionX();
						p.y = screenManager.getGameEngine().getGameField().getLineRider().getPositionY();
						lineDrawn.add(p);
						screenManager.getGameEngine().getGameField().getBackgroundManager().addToArrayList(p);
					
					
					if(x == 1){
						backgroundManager.cutBackground(lineDrawn);
						lineDrawn.clear();
					}
						
					if(x == 2){
						backgroundManager.removePointFromLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX() - 1, screenManager.getGameEngine().getGameField().getLineRider().getPositionY() - 1);
						lineDrawn.remove(lineDrawn.size() - 1);
					}
					screenManager.getGameEngine().getGameField().repaint();
					screenManager.getGameEngine().repaint();
					screenManager.repaint();
				}
				
			}
			if(e.getKeyCode() == 80){
				screenManager.getGameEngine().pauseGame();
				Queue<JButton> listOfButtons = screenManager.setCurrentPanelHolder("pause");
				while(!listOfButtons.isEmpty()){
					listOfButtons.remove().addActionListener(this);
				}
			}
		}
		if(!isSpacePressed){
			if(e.getKeyCode() == 37){
				screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithoutSpace(-1, 0);
				screenManager.getGameEngine().repaint();
				screenManager.repaint();
			}
			if(e.getKeyCode() == 38){
				screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithoutSpace(0, -1);
				screenManager.getGameEngine().repaint();
				screenManager.repaint();
				
			}
			if(e.getKeyCode() == 39){
				screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithoutSpace(1, 0);
				screenManager.getGameEngine().repaint();
				screenManager.repaint();
			}
			if(e.getKeyCode() == 40){
				screenManager.getGameEngine().getGameField().getLineRider().updatePositionWithoutSpace(0, 1);
				screenManager.getGameEngine().repaint();
				screenManager.repaint();
			}
			if(e.getKeyCode() == 80){
				screenManager.getGameEngine().pauseGame();
				Queue<JButton> listOfButtons = screenManager.setCurrentPanelHolder("pause");
				while(!listOfButtons.isEmpty()){
					listOfButtons.remove().addActionListener(this);
				}
			}
			if(e.getKeyCode() == 32){//SPACE
				isSpacePressed = true;
				backgroundManager.addPointToLine(screenManager.getGameEngine().getGameField().getLineRider().getPositionX(), screenManager.getGameEngine().getGameField().getLineRider().getPositionY());
				initialPosition.x = screenManager.getGameEngine().getGameField().getLineRider().getPositionX();
				initialPosition.y = screenManager.getGameEngine().getGameField().getLineRider().getPositionY();
				lineDrawn.add(initialPosition);
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 32){//SPACE
			isSpacePressed = false;
			//Backgroundmanager'ın özellikleri çağırılacak
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			
		if(e.getActionCommand().equals("saveGame")){
			
		}
		else if(e.getActionCommand().equals("newGame")){
			screenManager.setCurrentPanelHolderFor("new").addKeyListenerToGameEngine(this);
			screenManager.getGameEngine().setFocusable(true);
			screenManager.getGameEngine().requestFocusInWindow();
			backgroundManager = new BackgroundManager();
			screenManager.getGameEngine().setBackgroundManager(backgroundManager);
		}
		else if(e.getActionCommand().equals("loadGame")){
			screenManager.setCurrentPanelHolderFor("load").addKeyListenerToGameEngine(this);
			screenManager.getGameEngine().setFocusable(true);
			screenManager.getGameEngine().requestFocusInWindow();
			backgroundManager = new BackgroundManager();
			screenManager.getGameEngine().setBackgroundManager(backgroundManager);
		}
		else if(e.getActionCommand().equals("continueGame")){
			screenManager.setCurrentPanelHolder(e.getActionCommand());
			screenManager.getGameEngine().setFocusable(true);
			screenManager.getGameEngine().requestFocusInWindow();
			screenManager.getGameEngine().continueGame();
		}
		else{
			Queue<JButton> listOfButtons = screenManager.setCurrentPanelHolder(e.getActionCommand());
			while(listOfButtons != null && !listOfButtons.isEmpty()){
				listOfButtons.remove().addActionListener(this);
			}
		}
	}

}
