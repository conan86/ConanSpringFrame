package com.ans.conan.spring.autowire.impl;

import com.ans.conan.spring.autowire.Instrument;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("instrument")
public class Piano implements Instrument {
	
	@Value(value="10086")
	private String number;
	
	@Override
	public void play() {
		System.out.println("Piano #" + number);
		System.out.println("Piano PLINK PLINK PLINK ........"); 
	}

}
