package com.rohuu.drawingApp;

import org.springframework.beans.factory.annotation.Autowired;


public class Circle implements Shape {
	
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Autowired
	// Autowire happens byType but if there are more beans of same type then it checks byName and runs program(using byName)
	// and if more beans have same type then it throws exception that it can't recognize bean....
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing triangle");
		System.out.println("Circle: Point is: ("+center.getX()+", "+center.getY()+")");
	}

}
