package com.nit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix="org.softtek")
public class Employee {
	//simple properties
	private Integer eno;
	private String ename;
	
	//Array type
	private String[] favColors;
	
	//Collection type
	private List<String> nicknames;
	private Set<Long> phoneNumbers;
	private Map<String,Object> idDetails;
	
	//Has A Properties
	private Company company;
}
