package com.arun.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class DukeInstrumentalist implements Performer {

	@Autowired
	private Instrument dukeInstrument;

	public void performs() {
		dukeInstrument.play();
		System.out.println("Duke performing");
	}

	public Instrument getDukeInstrument() {
		return dukeInstrument;
	}

	public void setDukeInstrument(Instrument dukeInstrument) {
		this.dukeInstrument = dukeInstrument;
	}

}
