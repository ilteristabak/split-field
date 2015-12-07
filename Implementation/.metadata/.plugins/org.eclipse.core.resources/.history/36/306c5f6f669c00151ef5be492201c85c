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
		velocity += difference;
		if(velocity < 0)
			velocity = 0;
	}
	public int getVelocity(){
		return velocity;
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
	public void updatePosition(int x, int y){
		positionX = x;
		positionY = y;
	}
	public int getPositionX(){
		return positionX;
	}
	public int getPositionY(){
		return positionY;
	}
}