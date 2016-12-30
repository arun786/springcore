package com.arun.games;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Performer duke = ctx.getBean("duke",Juggler.class);
		duke.performer();
		
		duke = ctx.getBean("dukeValue", Juggler.class);
		duke.performer();
		
		duke = ctx.getBean("dukeSetter",JugglerSetter.class);
		duke.performer();
		
		duke = ctx.getBean("poeticJuggler", PoeticJuggler.class);
		duke.performer();
		
		duke = ctx.getBean("poeticJugglerConstructor",PoeticJuggler.class);
		duke.performer();
		
		
	}

}
