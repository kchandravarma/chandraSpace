package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPropertiesDemoApplication {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(SpringPropertiesDemoApplication.class, args);
	Object obg=ac.getBean("employee");
	System.out.println(obg);
	}

}
