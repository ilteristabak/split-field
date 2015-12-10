package com.group15.splitfield.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.group15.splitfield.controller.BackgroundManager;
import com.group15.splitfield.controller.GameField;

public class ClearMinors extends PowerUp{
	private ImageIcon clearMinorsImage;
	
	public ClearMinors(int positionX, int positionY, String name) {
		super(positionX, positionY, name);
		clearMinorsImage = new ImageIcon("ClearMinors.png");
	}

	@Override
	public void draw(Graphics g) {
		Image image = clearMinorsImage.getImage();
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

	@Override
	public void setGameField(GameField gameField) {
		// TODO Auto-generated method stub
		
	}
}
