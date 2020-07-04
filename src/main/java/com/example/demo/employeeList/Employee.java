package com.example.demo.employeeList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	private String name;
	@Id
	private String id;
	private String jobTittle;
	
	Employee(String name, String id, String jobTittle){
		super();
		this.id = id;
		this.name = name;
		this.jobTittle = jobTittle;
	}
	
	Employee(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJobTittle() {
		return jobTittle;
	}

	public void setJobTittle(String jobTittle) {
		this.jobTittle = jobTittle;
	}
	
	

}
