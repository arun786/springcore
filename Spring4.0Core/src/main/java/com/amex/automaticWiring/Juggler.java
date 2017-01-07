package com.amex.automaticWiring;

import org.springframework.stereotype.Component;

@Component("Duke")
public class Juggler implements Performer {

	public void perform() {
		System.out.println("Juggler performing");
	}

}
