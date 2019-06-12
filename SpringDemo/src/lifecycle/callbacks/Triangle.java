package lifecycle.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println( "Point A (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println( "Point B (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println( "Point C (" + pointC.getX() + ", " + pointC.getY() + ")");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called in Triangle");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean destroy method called in Triangle");
	}
	
	public void myInit() {
		System.out.println("My init method called in Triangle");
	}
	
	public void cleanUp() {
		System.out.println("My Destroy method called in Triangle");
	}
	
	public void myInitGlobal() {
		System.out.println("My init Golbal method called in Triangle");
	}
	
	public void cleanUpGlobal() {
		System.out.println("My Destroy Golbal method called in Triangle");
	}
}
