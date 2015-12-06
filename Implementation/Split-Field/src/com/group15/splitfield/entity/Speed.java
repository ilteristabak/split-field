package com.group15.splitfield.entity;

public class Speed extends PowerUp {
	
	private static final int VELOCITY = 100;
	private static final int DURATION = 30;
	
	public Speed(int positionX, int positionY, String name) {
		super(positionX, positionY, name);
		// TODO Auto-generated constructor stub
	}
	
	public int getVelocity(){
		return VELOCITY;
	}
	public int getDuration(){
		return DURATION;
	}
}