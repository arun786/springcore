package com.arun.SpringIdol;

public class Juggler implements Performer {
	private String beanBags;
	private Poem poem;

	public Juggler(String beanBags) {
		super();
		this.beanBags = beanBags;
	}
	
	public Juggler(String beanBags, Poem poem) {
		super();
		this.beanBags = beanBags;
		this.poem = poem;
	}

	public void perform() {
		System.out.println("Juggling " + beanBags + "  bean bags...");
	}

	public void PerformAndSing() {
		System.out.println("Juggling " + beanBags + "  bean bags...");
		poem.Sing();
	}

}
