package com.group15.splitfield.controller;

import java.awt.Point;
import java.util.ArrayList;

public class BackgroundManager {
	private int pixels[][];
	private double totalCutRatio;
	private double currentCutRatio;
	private ArrayList<Point> line;
	Point point;
	
	public BackgroundManager(){
		pixels = new int[775][1400];
		line = new ArrayList<Point>();
		for(int i = 0; i < 775; i++){
			pixels[i][0] = 3;
			pixels[i][1399] = 3;
		}
		for(int i = 0; i < 1400; i++){
			pixels[0][i] = 3;
			pixels[774][i] = 3;
		}
			
		totalCutRatio = 0;
		currentCutRatio = 0;
	}
	public void updatePixels(int p[][]){
		this.pixels = p;
	}
	public void destroyLine(){
		for(int i = 0; i < line.size(); i++){
			pixels[line.get(i).y][line.get(i).x] = 0;
		}
		line.clear();
	}
	
	public void cutBackground(ArrayList<Point> list){
		System.out.println("CUTBACK");
	
		if(list.size() > 0){
			point = list.get(0);
			Point initialPoint = list.get(0);
			Point lastPoint = list.get(list.size() - 1);
			int min = 1000000;
			if(initialPoint.x < lastPoint.x && initialPoint.y == lastPoint.y) {
				for(int i = 0; i < list.size(); i++){
					pixels[list.get(i).y][list.get(i).x] = 3;
					if(list.get(i).y < min){
						min = list.get(i).y;
					}
				}
				for(int i = initialPoint.x + 1; i < lastPoint.x; i++){
					for(int j = min + 1; j <= lastPoint.y; j++){
						pixels[j][i] = 1;
					}
				}
			}
			else if(initialPoint.x > lastPoint.x && initialPoint.y == lastPoint.y) {
				for(int i = 0; i < list.size(); i++){
					pixels[list.get(i).y][list.get(i).x] = 3;
					if(list.get(i).y < min){
						min = list.get(i).y;
					}
				}
				for(int i = lastPoint.x + 1; i < initialPoint.x; i++){
					for(int j = min + 1; j <= lastPoint.y; j++){
						pixels[j][i] = 1;
					}
				}
			}
			else if(initialPoint.y < lastPoint.y && initialPoint.x == lastPoint.x) {
				for(int i = 0; i < list.size(); i++){
					pixels[list.get(i).y][list.get(i).x] = 3;
					if(list.get(i).x < min){
						min = list.get(i).x;
					}
				}
				for(int i = initialPoint.y + 1; i < lastPoint.y; i++){
					for(int j = min + 1; j <= lastPoint.x; j++){
						pixels[j][i] = 1;
					}
				}
			}
			else if(initialPoint.y > lastPoint.y && initialPoint.x == lastPoint.x) {
				for(int i = 0; i < list.size(); i++){
					pixels[list.get(i).y][list.get(i).x] = 3;
					if(list.get(i).x < min){
						min = list.get(i).x;
					}
				}
				for(int i = lastPoint.y + 1; i < initialPoint.y; i++){
					for(int j = min + 1; j <= lastPoint.x; j++){
						pixels[j][i] = 1;
					}
				}
			}
			
			
		}
		
		//currentCutRatio = (currentCutPixels/1400*800)*100;
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
		pixels[positionY][positionX] = 2;
	}
	public void removePointFromLine(int positionX, int positionY){
		pixels[positionY][positionX] = 0;
	}
	public Point getInitialPoint(){
		return line.get(0);
	}
	public ArrayList<Point> getLine(){
		return line;
	}
	public void addToArrayList(Point p){
		line.add(p);
	}
	
}
