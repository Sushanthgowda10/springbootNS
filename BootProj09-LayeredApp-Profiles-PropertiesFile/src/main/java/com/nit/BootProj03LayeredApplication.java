package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.controller.PayrollOperationController;
import com.nit.model.Employee;

@SpringBootApplication
public class BootProj03LayeredApplication {

	public static void main(String[] args) {
		
		//get IOC Container
	ApplicationContext cxt=	SpringApplication.run(BootProj03LayeredApplication.class, args);
	
	//get the controller class obj ref
	PayrollOperationController controller=cxt.getBean("payroll",PayrollOperationController.class);
	
	//invoke the b.methods
	try {
		List<Employee>list=controller.showAllEmployeesByDesgs("CLERK", "MANAGER", "DEVELOPER");
		list.forEach(emp->{
			System.out.println(emp);
		});

	}//try
	catch(Exception e){
		e.printStackTrace();	
		System.err.println("Internal Problem - try again"+e.getMessage());
	}
	
	
	
	}

}
