package com.test.app;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcApp {

	public static void main(String[] args) {
		
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("jdbcContext.xml");
		 JdbcTemplate jdbctemplate = springContainer.getBean("jdbcTemplate",JdbcTemplate.class);
		 
		 List<Map<String,Object>> rowCount = jdbctemplate.queryForList("select count(*) from employee");
		  System.out.println(rowCount);
		 

	}

}
