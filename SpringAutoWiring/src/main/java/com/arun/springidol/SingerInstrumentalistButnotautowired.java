package com.arun.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class SingerInstrumentalistButnotautowired implements Performer {
	@Autowired
	private Singer abc;

	public void performs() {
		abc.sings();
	}

	public Singer getAbc() {
		return abc;
	}

	public void setAbc(Singer abc) {
		this.abc = abc;
	}

}
