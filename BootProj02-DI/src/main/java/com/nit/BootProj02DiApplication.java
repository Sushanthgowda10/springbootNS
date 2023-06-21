package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nit/cfgs/applicationContext.xml")
public class BootProj02DiApplication {

	public static void main(String[] args) {
		//get container
		ApplicationContext ctx=  SpringApplication.run(BootProj02DiApplication.class, args);
		
		//get target class reference
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		
		//invoke the b methods
		vehicle.journey("Bangalore","Mysore");
		
	}

}
