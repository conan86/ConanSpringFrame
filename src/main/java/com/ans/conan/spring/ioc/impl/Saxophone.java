package com.ans.conan.spring.ioc.impl;

import com.ans.conan.spring.ioc.Instrument;

public class Saxophone implements Instrument {
	
	private String number;

	@Override
	public void play() {
		System.out.println("Saxophone TOOT TOOT TOOT..");
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
