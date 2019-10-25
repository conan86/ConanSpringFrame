package com.ans.conan.spring.ioc.impl;

import com.ans.conan.spring.ioc.Instrument;
import com.ans.conan.spring.ioc.Performer;

public class Instrumentalist implements Performer {

	private String song;
	
	private Instrument instrument;
	
	@Override
	public void perform() {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
}
