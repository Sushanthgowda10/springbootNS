package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sbeans.Employee;

@SpringBootApplication
public class BootProj06ConfigurationPropertiesOnArrayListSetHasAPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj06ConfigurationPropertiesOnArrayListSetHasAPropertiesApplication.class, args);
	
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
	
	}

}
