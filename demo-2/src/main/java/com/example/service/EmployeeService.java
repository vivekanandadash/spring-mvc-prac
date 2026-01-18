package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeRepository;
import com.example.entity.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;

public void saveEmployee(String name ,String email ,String mobile) {
	Employee employee = new Employee();
	employee.setName(name);
	employee.setEmail(email);
	employee.setMobile(mobile);
	employeeRepository.save(employee);
}
}
