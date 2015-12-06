package com.group15.splitfield.entity;

public abstract class Enemy extends GameObject{
	protected int length;
	protected int width;
	protected int velocity;
	protected String name;
	protected int health;
	protected int damage;
	
	public Enemy(int positionX, int positionY, int length, int width, int velocity, String name, int health, int damage) {
		super(positionX, positionY);
		this.length = length;
		this.width = width;
		this.velocity = velocity;
		this.name = name;
		this.health = health;
		this.damage = damage;
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return name;
	}
	
	public int getX(){
		return positionX;
	}
	public int getY(){
		return positionY;
	}
	public abstract void incrementVelocityBy(int velocity);
	public abstract void decrementHealthBy(int damage);
	public abstract int getDamage();
}
