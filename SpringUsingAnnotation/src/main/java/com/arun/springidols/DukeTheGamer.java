package com.arun.springidols;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DukeTheGamer implements Performer {

	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;

	@Autowired
	@Qualifier("cricket")
	private Games games;

	public void perform() {
		instrument.play();
		games.games();
	}

}
