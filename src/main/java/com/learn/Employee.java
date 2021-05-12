package com.learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {

	@Value("${myapp.test.name}")
	private String name;
	@Value("${myapp.test.age}")
	private String age;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}
