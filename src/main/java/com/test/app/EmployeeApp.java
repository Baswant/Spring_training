package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.employee.Employee;

public class EmployeeApp {

	public static void main(String[] args) {

		
	ApplicationContext springContainer = new ClassPathXmlApplicationContext("employeeContext.xml");
	
	Employee emp = springContainer.getBean("employee", Employee.class);
			
	System.out.println("Employee info =" + emp);

	}

}
