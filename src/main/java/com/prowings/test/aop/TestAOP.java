package com.prowings.test.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.prowings.beans.Employee;
import com.prowings.beans.Student;
import com.prowings.config.AppConfig;

public class TestAOP {
	
	public static void main(String[] args) {
	
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Employee emp = context.getBean(Employee.class,"employee");		
//		emp.work();
//		emp.getEmployeeByName("RAM");
		
		Student student = context.getBean(Student.class);
		
		student.showStudent(); 
		
		student.hello(); 		
	}

}
