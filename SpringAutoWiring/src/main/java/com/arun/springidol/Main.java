package com.arun.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Performer perform = ctx.getBean("instrumentalist",Instrumentalist.class);
		perform.performs();
		
		perform = ctx.getBean("dukeInstrumentalist", DukeInstrumentalist.class);
		perform.performs();
	}

}
