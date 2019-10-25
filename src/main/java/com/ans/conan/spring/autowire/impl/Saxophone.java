package com.ans.conan.spring.autowire.impl;

import com.ans.conan.spring.autowire.Instrument;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("saxophone")
public class Saxophone implements Instrument {
	
	@Value(value="10010")
	private String number;

	@Override
	public void play() {
		System.out.println("Saxophone : #" +number);
		System.out.println("Saxophone TOOT TOOT TOOT..");
	}

}
