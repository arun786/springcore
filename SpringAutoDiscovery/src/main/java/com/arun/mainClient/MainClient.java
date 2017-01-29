package com.arun.mainClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.Performers.DukeThePerformer;
import com.arun.Performers.Performer;

public class MainClient {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Performer perform = ctx.getBean("duke",DukeThePerformer.class);
		perform.perform();
	}

}
