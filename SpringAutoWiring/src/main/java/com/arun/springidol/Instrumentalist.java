package com.arun.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {

	@Autowired
	private Instrument instrument;

	public void performs() {
		instrument.play();
		System.out.println("Performing");
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
