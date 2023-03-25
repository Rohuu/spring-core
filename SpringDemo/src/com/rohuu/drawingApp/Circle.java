package com.rohuu.drawingApp;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Required
	// if this is not set before running the program then spring's beanPostProcessor will throw error
	// for that we have to declare spring's postProcessor in xml
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing triangle");
		System.out.println("Circle: Point is: ("+center.getX()+", "+center.getY()+")");
	}

}
