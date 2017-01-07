package com.amex.automaticWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amex.spring.Poem;

@Component("RabindraJuggler")
public class PoeticJuggler implements Performer {

	@Autowired
	Poem poem;

	public void perform() {
		poem.recite();
		System.out.println("Juggling too...");
	}

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}

}
