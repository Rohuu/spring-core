package com.rohuu.drawingApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;

	public MessageSource getMessageSource() {
		return messageSource;
	}


	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}


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
		System.out.println(this.messageSource.getMessage("drawing.circle", null,"Default Drawing Message",null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()},"Default Point Message",null));
		System.out.println(this.messageSource.getMessage("greeting", null,"Default Greeting",null));
		DrawEvent drawEvent=new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
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


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}

}
