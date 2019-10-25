package com.ans.conan.spring.ioc.impl;

import com.ans.conan.spring.ioc.Auditorium;

public class AuditoriumImpl implements Auditorium {

	@Override
	public void turnOnLights() {
		 System.out.println("turn on lights");
	}
	
	public void action() {
		System.out.println("action!!!");
	}

	@Override
	public void turnOffLights() {
		System.out.println("turn off lights");
	}

}
