package com.rohuu.drawingApp;

public class Triangle {
	
	private String type;
	
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
		// spring is using this setter method in property tag in order to initialize the value 
		// this is called setter injection
	}



	public void draw() {
		System.out.println(getType() +" Triangle drawn");
	}
}
