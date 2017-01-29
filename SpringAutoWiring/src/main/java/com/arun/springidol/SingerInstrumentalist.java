package com.arun.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class SingerInstrumentalist implements Performer {

	@Autowired
	private Singer abc;

	public Singer getAbc() {
		return abc;
	}

	public void setAbc(Singer abc) {
		this.abc = abc;
	}

	public void performs() {
		abc.sings();
	}
}
