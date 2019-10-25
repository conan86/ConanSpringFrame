package com.ans.conan.spring.ioc.impl;

import com.ans.conan.spring.ioc.Instrument;

public class Piano implements Instrument {
	
	private String number;
	@Override
	public void play() {
		System.out.println("Piano #" + number);
		System.out.println("PLINK PLINK PLINK ........"); 
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
