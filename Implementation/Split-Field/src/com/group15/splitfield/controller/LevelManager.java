package com.group15.splitfield.controller;

import java.util.ArrayList;

public class LevelManager {
	private ArrayList<int[][]> allLevels;
	private FileManagerForLevel fileManager;
	
	public LevelManager(String fileName){
		fileManager = new FileManagerForLevel(fileName);
		allLevels = fileManager.getAllLevels();
	}
	
	public int[][] takeCurrentLevel(int levelNo){
		return allLevels.get(levelNo);
	}
	
}
