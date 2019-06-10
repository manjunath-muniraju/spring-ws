package org.manju.purva;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		
		// using Xml Bean Factory
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		
		// using Application Context
		// in this case, spring.xml should be inside classpath. move spring.xml inside src folder.
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		//Triangle triangle = (Triangle) context.getBean("triangle");
		//triangle.draw();
		
		Triangle triangleConst = (Triangle) context.getBean("triangleConst");
		
		triangleConst.draw();

	}

}
