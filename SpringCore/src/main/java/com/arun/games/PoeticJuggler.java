package com.arun.games;

public class PoeticJuggler implements Performer {
	private Poem poem;
	private int beanBags;
	
	public PoeticJuggler(){
		
	}
	
	public PoeticJuggler(Poem poem, int beanBags) {
		super();
		this.poem = poem;
		this.beanBags = beanBags;
	}

	public void performer() {
		poem.recite();
		System.out.println("Juggling " + beanBags + "  bean bags using Object references");

	} 

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}

	public int getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(int beanBags) {
		this.beanBags = beanBags;
	}
	
}
