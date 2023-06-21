package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	//@Qualifier("pEngine")//perform by name auto wiring
	//@Qualifier("${engine.type}") invalid
	//@Qualifier("@value${engine.type}") invalid
	//@Value("@value${engine.type}") invalid
	@Qualifier("engg")
	private IEngine engine;// Has A Property

	public Vehicle() {
		System.out.println("Vehicle - 0 param Constructor");
	}

	// b.method
	public void journey(String startPlace, String destPlace) {
		engine.start();
		System.out.println("Journey started at:: " + startPlace);
		System.out.println("Journey id going on.....");
		engine.stop();
		System.out.println("Journey Ended at:: " + destPlace);
	}

}
