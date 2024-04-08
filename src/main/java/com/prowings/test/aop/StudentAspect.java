package com.prowings.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class StudentAspect {

	@Before("execution(* com.prowings.beans.Student.*(..))")
	public void logBefore() {
		
		System.out.println(">>>> before ");
		
	}
	@After("execution(* com.prowings.beans.Student.*(..))")
	public void logAfter() {
		
		System.out.println(">>>> after ");
		
	}
	
//	@Around("execution(* com.prowings.beans.Student.*(..))")
//	public void logBeforeAfter(ProceedingJoinPoint joinPoint) throws Throwable {
//		
//		System.out.println(">> BeforeAfter <<");
//		Object returnedValue = joinPoint.proceed();
//		
//		System.out.println(returnedValue);
//		System.out.println(">> BeforeAfter <<");
//		
//	}
	
}
