package com.arun.springidols;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Performer perform = ctx.getBean("duke",DukePerformer.class);
		perform.perform();
		
		System.out.println("==================");
		perform = ctx.getBean("dukeAdriot",DukeAdriotPerformer.class);
		perform.perform();
		
		System.out.println("==================");
		perform = ctx.getBean("dukeGamer",DukeTheGamer.class);
		perform.perform();
	}

}
