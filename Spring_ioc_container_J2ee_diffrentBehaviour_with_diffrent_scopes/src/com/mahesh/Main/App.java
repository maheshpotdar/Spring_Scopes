package com.mahesh.Main;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/Resources/spring.xml");
		context.getBean("t1");
	}

}
