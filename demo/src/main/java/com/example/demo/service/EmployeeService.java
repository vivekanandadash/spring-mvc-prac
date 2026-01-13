package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepository;
import com.example.demo.entity.Employee;

@Service  
public class EmployeeService {
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public void saveEmployee(Employee employee) {
//		employeeRepository.save(employee);
//	}
	public void saveEmployee(String name, String email, String mobile) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setMobile(mobile);
		employeeRepository.save(employee);
	}
}
