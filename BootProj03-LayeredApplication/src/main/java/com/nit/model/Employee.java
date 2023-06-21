package com.nit.model;

import lombok.Data;

@Data//it will generate setter, getter ,constructors and tostring at runtime in proxy class
public class Employee {
	private Integer eno;//always use wrapper
	private String ename;
	private String eaddrs;
	private String desg;
	private Double salary;
	private Integer deptno;
	
	

}
