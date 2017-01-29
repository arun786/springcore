package com.arun.Performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.arun.Instruments.Instrument;

@Component
@Qualifier("duke")
public class DukeThePerformer implements Performer{

	@Autowired
	private Instrument instrument;
	
	public void perform() {
		System.out.println("Duke is performing");
		instrument.play();
	}
	
	

}
