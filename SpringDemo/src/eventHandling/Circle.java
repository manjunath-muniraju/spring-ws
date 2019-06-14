package eventHandling;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println( "Drawing Circle");
		System.out.println( "Circle : (" + center.getX() + ", " + center.getY() + ")");
		
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println( "Init using Annotations");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println( "destroy using Annotations");
	}

}
