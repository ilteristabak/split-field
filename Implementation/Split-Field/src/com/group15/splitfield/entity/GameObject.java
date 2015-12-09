package com.group15.splitfield.entity;

import java.awt.Graphics;

import com.group15.splitfield.controller.BackgroundManager;

public abstract class GameObject {
	protected int positionX;
	protected int positionY;
	protected int borderX1;
	protected int borderX2;
	protected int borderY1;
	protected int borderY2;
	protected BackgroundManager backgroundManager;
	
	public GameObject(int positionX, int positionY){
		this.positionX = positionX;
		this.positionY = positionY;
	}
	public int getPositionX() {
		return positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public abstract void draw(Graphics g);
	public abstract void updatePosition();
	public abstract void updatePosition(int x, int y);
	public abstract void updateBorders(int x1, int x2,int y1,int y2);
	public abstract void setBackgroundManager(BackgroundManager backgroundManager);
}