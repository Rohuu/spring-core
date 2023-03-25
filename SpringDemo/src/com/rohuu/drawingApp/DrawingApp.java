package com.rohuu.drawingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Shape shape= (Shape) context.getBean("circle");    
		shape.draw();
		context.registerShutdownHook();
	}
}
