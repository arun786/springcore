package com.arun.springidols;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DukeAdriotPerformer implements Performer{
	
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;

	public void perform() {
		System.out.println("Duke Adriot Performing....");
		instrument.play();
	}

}
