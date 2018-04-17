package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.EmployeeDetails;

@Component
public class DatabaseSeeder implements CommandLineRunner{

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public DatabaseSeeder(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		List<EmployeeDetails> employees = new ArrayList<>();
		
		employees.add(new EmployeeDetails("Sam", "Dept1", 8882223344L, "sam@outback.com"));
		employees.add(new EmployeeDetails("Arun", "Dept2", 8882223345L, "Arun@outback.com"));
		employees.add(new EmployeeDetails("Kim", "Dept3", 8882223346L, "Kim@outback.com"));
		employees.add(new EmployeeDetails("Bob", "Dept3", 8882223347L, "Bob@outback.com"));
		employees.add(new EmployeeDetails("Reena", "Dept3", 8882223348L, "Reena@outback.com"));
		employees.add(new EmployeeDetails("Neha", "Dept1", 8882223355L, "Neha@outback.com"));
		employees.add(new EmployeeDetails("Mihir", "Dept2", 8882223356L, "Mihir@outback.com"));
		employees.add(new EmployeeDetails("Lina", "Dept1", 8882223357L, "Lina@outback.com"));
		employees.add(new EmployeeDetails("Dan", "Dept2", 8882223360L, "Dan@outback.com"));
		
		employeeRepository.save(employees);
	}

}
