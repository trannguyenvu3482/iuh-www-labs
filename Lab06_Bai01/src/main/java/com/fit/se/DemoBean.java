package com.fit.se;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fit.se.entity.Employee;

public class DemoBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = context.getBean("e", Employee.class);
		employee.show();
		context.close();
	}
}
