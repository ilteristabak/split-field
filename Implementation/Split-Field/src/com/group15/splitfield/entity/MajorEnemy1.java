package com.group15.splitfield.entity;

public class MajorEnemy1 extends Enemy {

	public MajorEnemy1(int positionX, int positionY, int length, int width, int velocity, String name, int health,
			int damage) {
		super(positionX, positionY, length, width, velocity, name, health, damage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void incrementVelocityBy(int velocity) {
		// TODO Auto-generated method stub
		this.velocity += velocity;
	}

	@Override
	public void decrementHealthBy(int damage) {
		// TODO Auto-generated method stub
		this.health -= damage;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return health;
	}
	public int getLength(){
		return length;
	}

}
