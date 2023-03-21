package com.rohuu.drawingApp;

public class Triangle {
	
	private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}


	public Triangle(String type) {
		this.type=type;
	}
	
	public Triangle(int height) {
		this.height=height;
	}
	
	public Triangle(String type, int height) {
		this.type=type;
		this.height=height;
	}
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
		// spring is using this setter method in property tag in order to initialize the value 
		// this is called setter injection
	}



	public void draw() {
		System.out.println(getType() +" Triangle drawn of height "+getHeight());
	}
}
