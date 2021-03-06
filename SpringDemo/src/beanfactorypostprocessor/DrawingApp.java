package beanfactorypostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-factory-post-processor.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");

		triangle.draw();
	}

}
