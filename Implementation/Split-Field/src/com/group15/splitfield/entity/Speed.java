package com.group15.splitfield.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Speed extends PowerUp {
	
	private static final int VELOCITY = 100;
	private static final int DURATION = 30;
	private ImageIcon speedImage;
	
	public Speed(int positionX, int positionY, String name) {
		super(positionX, positionY, name);
		speedImage = new ImageIcon("Speed.png");
	}
	
	public int getVelocity(){
		return VELOCITY;
	}
	public int getDuration(){
		return DURATION;
	}
	@Override
	public void draw(Graphics g) {
		Image image = speedImage.getImage();
		g.drawImage(image, positionX - 1, positionY - 1, null);
		g.setColor(Color.BLACK);
	}
}
