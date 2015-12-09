package com.group15.splitfield.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.group15.splitfield.controller.BackgroundManager;

public class PauseShieldDecrement extends PowerUp{

	private static final int DURATION = 60;
	private ImageIcon pauseShieldDecrementImage;
	
	public PauseShieldDecrement(int positionX, int positionY, String name) {
		super(positionX, positionY, name);
		pauseShieldDecrementImage = new ImageIcon("PauseShieldDecrement.png");
	}
	
	public int getDuration(){
		return DURATION;
	}	
	@Override
	public void draw(Graphics g) {
		Image image = pauseShieldDecrementImage.getImage();
		g.drawImage(image, positionX - 1, positionY - 1, null);
		g.setColor(Color.BLACK);
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePosition(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBorders(int x1, int x2, int y1, int y2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackgroundManager(BackgroundManager backgroundManager) {
		// TODO Auto-generated method stub
		
	}
}
