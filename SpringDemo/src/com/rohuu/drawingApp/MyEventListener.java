package com.rohuu.drawingApp;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener{

	
	public void onApplicationEvent(ApplicationEvent event) {
		// this listens every action of spring and print that out
		System.out.println(event.toString());
	}

}
