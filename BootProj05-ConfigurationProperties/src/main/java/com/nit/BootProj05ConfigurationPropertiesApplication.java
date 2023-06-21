package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Company;

@SpringBootApplication
public class BootProj05ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		//Get IOC container
		ApplicationContext ctx= SpringApplication.run(BootProj05ConfigurationPropertiesApplication.class, args);
		//get Company class object reference
		Company comp=ctx.getBean("comp",Company.class);
		System.out.println(comp);
		
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
