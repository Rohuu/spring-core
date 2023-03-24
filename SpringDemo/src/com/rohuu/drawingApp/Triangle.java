package com.rohuu.drawingApp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle{ // if we want to know the name of bean
	
	// since triangle is singleton , point A,B,C will also be created along with triangle, when is container is loaded, and they will be initialized
	// even though points A,B,C are prototype, but they will be initialized only once because parent triangle is singleton.
	// now whenever we need objects of A,B,C, one way is use getBean
	// for that we should have access to the ApplicationContext
	// in order to get application context, implement interface ApplicationContextAware
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context=null;
	
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		
		System.out.println("Point A = ("+getPointA().getX()+ ", " +getPointA().getY()+")");

		System.out.println("Point B = ("+getPointB().getX()+ ", " +getPointB().getY()+")");

		System.out.println("Point C = ("+getPointC().getX()+ ", " +getPointC().getY()+")");

	}



//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean init method called for triangle");
//	}
//
//
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("DisposableBean destroy method called for triangle");	
//	}
	
	public void myInit() {
		System.out.println("myInit method called for triangle");
	}
	
	public void cleanUp() {
		System.out.println("my cleanUp method called for triangle");
	}
}
