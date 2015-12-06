package com.group15.splitfield.entity;

public class LineRider extends GameObject{

	private static final int LENGTH = 30;
	private static final int WIDTH = 40;
	private int velocity;
	private int noOfLives;
	private int health;
	
	public LineRider(int positionX, int positionY) {
		super(positionX, positionY);
		// TODO Auto-generated constructor stub
		velocity = 20;
		noOfLives = 3;
		health = 100;
	}
	
	public void incrementVelocityBy(int difference){
		health += difference;
	}
	
	public void decrementNoOfLives(){
		noOfLives -= 1;
	}
	
	public void decrementHealthBy(int decrement){
		health -= decrement;
		if(health < 0){
			decrementNoOfLives();
			health = 100;
		}
	}
	
	public int getNoOfLives(){
		return noOfLives;
	}
}