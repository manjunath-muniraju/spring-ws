package annotationsAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotations-autowired.xml");
		
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		doDrawing(circle);
	}
	
	public static void doDrawing(Shape shape) {
		shape.draw();
	}

}
