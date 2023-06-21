package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sbeans.Customer;

@SpringBootApplication
public class BootProj07YmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj07YmlApplication.class, args);
		
		Customer cust=ctx.getBean("cust",Customer.class);
		System.out.println(cust);
	}

}
