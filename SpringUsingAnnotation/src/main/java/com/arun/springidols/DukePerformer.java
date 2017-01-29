package com.arun.springidols;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DukePerformer implements Performer {
	
	@Autowired
	@Qualifier("saxophone")
	Instrument instrument;

	public void perform() {
		System.out.println("Duke Performing...");
		instrument.play();
	}

}
