package com.group15.splitfield.entity;

public abstract class Enemy extends GameObject{
	protected String name;
	
	public Enemy(int positionX, int positionY, String name) {
		super(positionX, positionY);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public abstract String getName();
	public abstract void updatePosition();
}
