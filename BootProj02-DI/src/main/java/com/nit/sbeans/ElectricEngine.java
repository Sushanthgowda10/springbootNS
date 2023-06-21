package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {
	
	public ElectricEngine() {
		System.out.println("ElectricEngine- 0 param Constructor");
	}

	@Override
	public void start() {
		System.out.println("ElectricEngine - started");
	}

	@Override
	public void stop() {
		System.out.println("ElectricEngine - stopped");
	}

}
