package com.test.app;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.student.Student;

public class StudentApp {

	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(StudentApp.class);
		
		ApplicationContext Springcontainer = new ClassPathXmlApplicationContext("studentContext.xml");
		
		Student stu = Springcontainer.getBean("Student", Student.class);
		Student stu1 = Springcontainer.getBean("Student1", Student.class);
		
		
		
		
		System.out.println("Student info =" + stu);
		System.out.println("Student1 info =" + stu1);
		
		
		

	}

}
