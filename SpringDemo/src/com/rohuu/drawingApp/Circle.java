package com.rohuu.drawingApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Controller
//@Component: it is general bean, rest all are general bean with some kind of roles
// @Service: tells additional info to spring that it is a service bean
// @Repository: tells additional info to spring that it is a data object bean
// @Controller: tells additional info to spring that it is a controller bean

public class Circle implements Shape {
	
	private Point center;

	public Point getCenter() {
		return center;
	}

	
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
