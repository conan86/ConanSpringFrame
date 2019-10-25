package com.ans.conan.spring.ioc.impl;

import java.util.Map;

import com.ans.conan.spring.ioc.Instrument;
import com.ans.conan.spring.ioc.Performer;

public class OneManBand2 implements Performer {
	
	private Map<String, Instrument> instruments;

	@Override
	public void perform() {
		 for(String key : instruments.keySet()) {
			 System.out.println("key : " + key);
			 Instrument instrument = instruments.get(key);
			 instrument.play();
		 }
	}

	public Map<String,Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Map<String,Instrument> instruments) {
		this.instruments = instruments;
	}

}
