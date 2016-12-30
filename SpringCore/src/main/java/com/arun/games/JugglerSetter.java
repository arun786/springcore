package com.arun.games;

public class JugglerSetter implements Performer {
	int beanBags;

	public void performer() {
		System.out.println("Juggling " + beanBags + " bean Bags using Setter Injection");
	}

	public int getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}

}
