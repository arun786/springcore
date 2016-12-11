package com.arun.main;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		String name = ctx.getMessage("cricketer.name", new Object[] { 10000, 34 }, Locale.US);
		System.out.println(name);

		String ukName = ctx.getMessage("cricketer.name", new Object[] { 10000, 34 }, Locale.UK);
		System.out.println(ukName);
		
		
		System.out.println("Using Message aware......");
		CricketService cs = ctx.getBean("cricketService", CricketService.class);
		cs.printMessage();
	}

}
