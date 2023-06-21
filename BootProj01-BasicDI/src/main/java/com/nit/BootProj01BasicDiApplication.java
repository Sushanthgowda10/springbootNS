package com.nit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01BasicDiApplication {
	@Bean(name = "ldt")//store this in IOC Spring Container for re usability
	public LocalDateTime createLDT() {
		System.out.println("BootProj01BasicDiApplication.createLDT()");
		return LocalDateTime.now();// static factory method
	}

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(BootProj01BasicDiApplication.class, args);// returning  to IOC
																										// Container
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);

		// invoke b.method
		String message = generator.ShowWishMessage("Shree");
		System.out.println(message);
		
		((ConfigurableApplicationContext)factory).close();
	}

}
