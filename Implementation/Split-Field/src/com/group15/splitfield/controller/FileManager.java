package com.group15.splitfield.controller;

public abstract class FileManager {
	protected String fileName;
	
	public FileManager(String fileName){
		this.fileName = fileName;
	}

	protected abstract void execute();
}
