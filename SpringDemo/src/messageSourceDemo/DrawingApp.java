package messageSourceDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-message-source.xml");
		
		System.out.println(context.getMessage("greeting", null, "Default Greeting!", null));
		
		System.out.println(context.getMessage("no.key", null, "No Key. So, Default Greeting!", null));
		
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
	}

}
