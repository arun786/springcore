package com.amex.automaticWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CongifClass.class);
		Performer perform = ctx.getBean("Duke", Juggler.class);
		perform.perform();
		
		//Setter Injection
		
		AdriotJuggler adperform = ctx.getBean("AdriotDuke",AdriotJuggler.class);
		adperform.setBeanBags("10");
		adperform.perform();
	}

}
