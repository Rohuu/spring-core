package com.rohuu.drawingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Circle implements Shape {
	
	private Point center;

	public Point getCenter() {
		return center;
	}
	
//	but if we can't changes the id name...... then .... ?
//	 then we use another annotation called @Qualifier
	// first autowired mapping will be tested which is byType but if all types are same then 
	// qualifire will check the qualified value, where value is mapped, we will get bean 
	
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing triangle");
		System.out.println("Circle: Point is: ("+center.getX()+", "+center.getY()+")");
	}

}
