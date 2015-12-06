package com.group15.splitfield.controller;

public class LevelManager {
	private int allLevels[][][];
	private FileManagerForLevel fileManager;
	
	public LevelManager(){
		fileManager = new FileManagerForLevel("","");
		allLevels = fileManager.loadLevels();
	}
	
	public int[][] takeCurrentLevel(int levelNo){
		return allLevels[levelNo];
	}
	
}
