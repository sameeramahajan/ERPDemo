package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeRepository;

@RestController
@RequestMapping(value="/employees")
public class ERPController {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public ERPController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
		
	}
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<EmployeeDetails> getAll(){
		
		return employeeRepository.findAll();
	}
	
	@RequestMapping(value="/filter/{dept}", method = RequestMethod.GET)
	public List<EmployeeDetails> getByDept(@PathVariable String dept){
		return employeeRepository.findByDeptLike(dept);
		
	}
	
	@RequestMapping(value="/create/{empName}/{Dept}/{mobile}/{email}", method = RequestMethod.GET)
	public List<EmployeeDetails> create (@PathVariable String empName, @PathVariable String Dept, @PathVariable Long mobile, @PathVariable String email){
		EmployeeDetails employeeDetails = new EmployeeDetails(empName, Dept, mobile, email);
		employeeRepository.save(employeeDetails);
		return employeeRepository.findAll();
	}
	
	@RequestMapping(value="/delete/{Id}", method = RequestMethod.GET)
	public List<EmployeeDetails> remove(@PathVariable Long id){
		employeeRepository.delete(id);
		return employeeRepository.findAll();
	}
}
