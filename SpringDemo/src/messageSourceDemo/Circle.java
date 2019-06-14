package messageSourceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	
	@Autowired
	private Point center;
	
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Circle!", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Drawing Point!", null));
		System.out.println( "Printing Message from MessageSource: " + this.messageSource.getMessage("greeting", null, "Default Greeting!", null));
	}

}
