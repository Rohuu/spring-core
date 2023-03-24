package com.rohuu.drawingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
	
		// using bean factory to instantiate the Triangle class
//		Triangle triangle= new Triangle();
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		// using application context instead of bean factory
		// in ApplicationContext we don't have to use FileSystemResource object
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle= (Triangle) context.getBean("triangle");    // using alias name
		// we only have to call the top level bean that is triangle bean, further we don't have to call beans for each nested instances
		// like here we have called triangle bean but not points inside that
		triangle.draw();
		

	}
}
