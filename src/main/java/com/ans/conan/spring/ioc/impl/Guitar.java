package com.ans.conan.spring.ioc.impl;

import com.ans.conan.spring.ioc.Instrument;

public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing Guitar .......");
	}

}
