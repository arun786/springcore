package com.amex.automaticWiring;

import org.springframework.stereotype.Component;

@Component("AdriotDuke")
public class AdriotJuggler implements Performer {
	//Setter Injection
	private String beanBags;

	public void perform() {
		System.out.println("Juggling " + beanBags + " bean bags");
	}

	public String getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(String beanBags) {
		this.beanBags = beanBags;
	}

}
