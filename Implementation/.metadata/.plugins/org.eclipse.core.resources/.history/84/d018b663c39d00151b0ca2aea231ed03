package com.group15.splitfield.entity;

public class MinorEnemy2 extends Enemy {
	
	public MinorEnemy2(int positionX, int positionY, int length, int width, int velocity, String name, int health,
			int damage) {
		super(positionX, positionY, length, width, velocity, name, health, damage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName(){
		return name;
	}
	@Override
	public int getPositionX(){
		return positionX;
	}
	@Override
	public int getPositionY(){
		return positionY;
	}
	@Override
	public void updatePosition(int x, int y){
		positionX = x;
		positionY = y;
	}
	@Override
	public int getVelocity(){
		return velocity;
	}
	@Override
	public void incrementVelocityBy(int diff){
		velocity += diff;
	}
	@Override
	public void decrementHealthBy(int damage){
		health -= damage;
	}
	@Override
	public int getDamage(){
		return damage;
	}
	@Override
	public int getHealth(){
		return health;
	}
	
}
