package com.prowings.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prowings.beans.MyLogger;

@Aspect
@Component
public class EmployeeAspect {
	
	@Autowired
	MyLogger logger;
	
	long start;
	long end;
	

	@Before("execution(* com.prowings.beans.Employee.*(..))")
	public void log(JoinPoint joinPoint) throws Throwable {
		start = System.currentTimeMillis();
		System.out.println(" <<<<< before advice executed!!");
//		logger.log("before advice executed!! started at : "+ start);
//		System.out.println(">>> target method signature is : "+joinPoint.getSignature());
	}
	
	@After("execution(* com.prowings.beans.Employee.*(..))")
	public void logAfter(JoinPoint joinPoint) throws Throwable {
//		long end = System.currentTimeMillis();
		System.out.println(" >>>>>> after advice executed!!");
//		logger.log("after advice executed!! finised in : "+ (end - start) + "ms");
	}
}
