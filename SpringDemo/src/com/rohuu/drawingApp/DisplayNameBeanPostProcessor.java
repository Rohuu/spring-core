package com.rohuu.drawingApp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
	// apart from these implementation here, we have to tell spring that this needs to be registered as a BeanPostProcessor.. so configure in xml
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("In After bean Initialization method. Bean name is "+beanName);
	return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("In Before bean Initialization method. Bean name is "+beanName);
	return bean;
	}
}
