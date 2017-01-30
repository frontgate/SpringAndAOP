package org.koushik.javabrains;

import org.koushik.javabrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shape = ctx.getBean("shapeService", ShapeService.class);
		String circleName = shape.getCircle().getName();
		System.out.println("Circle Name : "+circleName);
		
	/*	String circleName = shape.getCircle().getName();
		String beanName = shape.getCircle().getBeanName();
		String recName = shape.getCircle().getRectangleName();
		System.out.println("Circle Name : "+circleName+" Bean Name : "+beanName);
		System.out.println("Rectangle Name : "+recName);*/

	}

}
