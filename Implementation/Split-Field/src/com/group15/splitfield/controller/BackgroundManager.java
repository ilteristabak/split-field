package com.group15.splitfield.controller;

import java.awt.Point;
import java.util.ArrayList;

public class BackgroundManager {
	private int pixels[][];
	private double totalCutRatio;
	private double currentCutRatio;
	
	public BackgroundManager(){
		pixels = new int[1300][668];
		for(int i = 0; i < 1300; i++){
			pixels[i][0] = 3;
			pixels[i][667] = 3;
		}
		for(int i = 0; i < 668; i++){
			pixels[0][i] = 3;
			pixels[1299][i] = 3;
		}
			
		totalCutRatio = 0;
		currentCutRatio = 0;
	}
	public void updatePixels(int p[][]){
		this.pixels = p;
	}
	public void destroyLine(ArrayList<Point> list){
		for(int i = 0; i < list.size(); i++){
			pixels[list.get(i).x][list.get(i).y] = 0;
		}
	}
	
	public void cutBackground(ArrayList<Point> list){
		int currentCutPixels = 0;
		int positionx1 = list.get(0).x;
		int positiony1 = list.get(0).y;	
		int positionxlast = list.get(list.size()-1).x;
		int positionylast = list.get(list.size()-1).y;	
		for(int x = positionx1 +1 ; x < positionxlast-1;x++) {
			for(int y = positiony1 +1; y < positionylast-1; y++) {
				
					pixels[x][y] = 1;
				currentCutPixels++;
			}
		}
		for(int i = 0; i < list.size();i++) {
			pixels[list.get(i).x][list.get(i).y] = 3;
		}
		
		currentCutRatio = (currentCutPixels/1300*668)*100;
		totalCutRatio += currentCutRatio;
	}
	public boolean isCutProper(Point initialPosition,Point lastPosition ){
		
		if(initialPosition.x == lastPosition.x && initialPosition.y == lastPosition.y)
			return false;
		else if(pixels[lastPosition.x][lastPosition.y] == 3)
			return true;
		else
			return false;
	}
	public boolean exceedCutRatio(){
		if(totalCutRatio >= 80)
			return true;
		else
			return false;
	}
	public int[][] getPixels(){
		return pixels;
	}
	public void addPointToLine(int positionX, int positionY){
		pixels[positionX][positionY] = 2;
	}
	public void removePointFromLine(int positionX, int positionY){
		pixels[positionX][positionY] = 0;
	}
	
}
