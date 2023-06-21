package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Hotel;

@SpringBootApplication
public class BootProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		//get IOC Container
		ApplicationContext cxt= SpringApplication.run(BootProj04ValueAnnotationSpelApplication.class, args);
		//
		Hotel hotel=cxt.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		//close the container
		((ConfigurableApplicationContext)cxt).close();
	}

}
