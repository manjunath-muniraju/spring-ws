package jsr250Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-jsr250-annotations.xml");
		context.registerShutdownHook();
		
		Circle circle = (Circle) context.getBean("circle");
		doDrawing(circle);
	}
	
	public static void doDrawing(Shape shape) {
		shape.draw();
	}

}
