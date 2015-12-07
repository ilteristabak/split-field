package com.group15.splitfield.controller;

public abstract class FileManager {
	private String fileName;
	
	public FileManager(String fileName){
		this.fileName = fileName;
	}

	public abstract void execute();
}
