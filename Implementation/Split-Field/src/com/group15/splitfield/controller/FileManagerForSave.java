package com.group15.splitfield.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagerForSave extends FileManager {

	private int currentLevel;
	public FileManagerForSave(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
		currentLevel = -1;
	}
	
	@Override
	public void execute() {
		
		File file = new File(super.fileName); 
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
	    	fw.write(Integer.toString(currentLevel));
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if(fw !=null){try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	    }
		
	}
	
	public void setCurrentLevel(int currentLevel) throws IOException {
		// TODO Auto-generated method stub
		this.currentLevel = currentLevel;
		execute();
	}
}
