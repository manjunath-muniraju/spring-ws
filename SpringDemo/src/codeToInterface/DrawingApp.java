package codeToInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-code-to-interface.xml");
		
		//not flexible 
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		//Better way of doing is below
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		// or much better way is create doDrawing()
		doDrawing(triangle);
		doDrawing(circle);
	}
	
	public static void doDrawing(Shape shape) {
		shape.draw();
	}

}
