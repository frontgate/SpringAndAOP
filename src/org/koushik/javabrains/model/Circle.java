package org.koushik.javabrains.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle /*implements ApplicationContextAware,BeanNameAware */{
	private String name;
	//private ApplicationContext context = null;
	//private String beanName = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}
	
	public String getRectangleName(){
		Rectangle rec = context.getBean("rectangle", Rectangle.class);
		
		return rec.getName();
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}
	
	public String getBeanName(){
		return beanName;
	}*/
	
}
