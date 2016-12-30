package com.arun.games;

public class Juggler implements Performer {
	private int beanBags = 3;
	
	public Juggler(){
		
	}

	/*Constructor Injection*/
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public void performer() {
		System.out.println("Juggling " + beanBags + " bean bags using Constructor Injection");
	}

}
