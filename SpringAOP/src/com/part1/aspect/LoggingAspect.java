package com.part1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	//@Before("execution(public String getName())")
	//@ Before runs whenever a call made to getName() of any class.
	
	// To run only for specific class we need to provide complete namespace of the class.
	@Before("allMethodsWithInCircle()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
	}
	
	
	//point cut
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	
	@Pointcut("within(com.part1.model.Circle)")
	public void allMethodsWithInCircle() {}

	
	
}
