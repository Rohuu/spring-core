package com.rohuu.drawingApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {


	public static void main(String[] args) {
		
		// using bean factory to instantiate the Triangle class
//		Triangle triangle= new Triangle();
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		// using application context instead of bean factory
		// in ApplicationContext we don't have to use FileSystemResource object
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle= (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
