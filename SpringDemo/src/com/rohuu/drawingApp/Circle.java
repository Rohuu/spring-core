package com.rohuu.drawingApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
	
	@Resource(name="pointC")
	// this annotation can do dependency injection by name, just write property name you want to inject
	// it will inject the dependency of given name
	// if no name is given then it look for the name of member variable
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing triangle");
		System.out.println("Circle: Point is: ("+center.getX()+", "+center.getY()+")");
	}
	
	
	@PostConstruct
	// configuring init and destroy method for circle bean without using xml configuration.... using annotation
	public void initializeCircle() {
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}

}
