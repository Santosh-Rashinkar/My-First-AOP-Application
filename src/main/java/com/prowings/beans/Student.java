package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public void showStudent() {

		System.out.println("inside showStudent() started.!!!");

		// some business logic

		if (10 % 2 == 0)
			throw new ArithmeticException();

		System.out.println("inside showStudent() ended..!!!");
	}

	public String hello() {
		System.out.println("inside hello");

		return "ABC";
	}
}
