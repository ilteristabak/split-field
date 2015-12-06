package com.group15.splitfield.entity;

public class Laser extends PowerUp {
	private static final int DAMAGE = 100;
	private static final int DURATION = 120;
	
	public Laser(int positionX, int positionY, String name) {
		super(positionX, positionY, name);
		// TODO Auto-generated constructor stub
	}
	
	public int getDamage(){
		return DAMAGE;
	}
	public int getDuration(){
		return DURATION;
	}

}
