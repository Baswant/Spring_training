package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bank.Bank;

public class BankApp {

	public static void main(String[] args) {

		ApplicationContext springContainer = new ClassPathXmlApplicationContext("bankContext.xml");
		Bank bank = springContainer.getBean("bank", Bank.class);
		System.out.println(bank);
		

	}

}
