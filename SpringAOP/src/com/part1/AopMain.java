package com.part1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.part1.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class); 
		// here casting is not required, the second parameter will take care of it
		
		System.out.println(shapeService.getCircle().getName());
		//System.out.println(shapeService.getTriangle().getName());
	}

}
