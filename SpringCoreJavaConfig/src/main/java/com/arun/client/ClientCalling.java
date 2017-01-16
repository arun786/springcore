package com.arun.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arun.SpringIdol.Juggler;
import com.arun.SpringIdol.Performer;
import com.arun.configurations.JavaConfig;

public class ClientCalling {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Performer perform = ctx.getBean("duke",Juggler.class);
		perform.perform();
		
		perform = ctx.getBean("tom",Juggler.class);
		perform.PerformAndSing();
	}

}
