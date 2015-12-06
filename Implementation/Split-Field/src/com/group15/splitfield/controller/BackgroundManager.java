package com.group15.splitfield.controller;

public class BackgroundManager {
	int pixels[][];
	double cutRatio;
	
	public BackgroundManager(){
		pixels = new int[800][600];
		cutRatio = 0;
	}
	public void updatePixels(int p[][]){
		this.pixels = p;
	}
	public boolean destroyLine(){
		return true;
	}
	public void cutBackground(){
		
	}
	public boolean isCutProper(){
		return true;
	}
	public boolean isExceedCutRatio(){
		if(cutRatio > 80)
			return true;
		else
			return false;
	}
	public int[][] getPixels(){
		return pixels;
	}
}