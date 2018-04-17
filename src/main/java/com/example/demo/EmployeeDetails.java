package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	private String empName;
	private String dept;
	private Long mobile;
	private String Email;
	
	public EmployeeDetails() {
		
	}
	
	public EmployeeDetails(String empName, String dept, Long mobile, String Email) {
		this.empName = empName;
		this.dept = dept;
		this.mobile = mobile;
		this.Email = Email;
	}
	
	public String getempName() {
		return empName;
	}
	
	public Long getmobile() {
		return mobile;
	}
	
	public String getdept() {
		return dept;
	}
		
	
	public Long getId() {
		return Id;
	}
	
	public String getEmail() {
		return Email;
	}
}

