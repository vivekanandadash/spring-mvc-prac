package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
 //Handler methods
//http://localhost:8080/view
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "register"; //--> this is act like request dispatcher in servlets controller layer  
		
	}
//	@RequestMapping("/save")
//	public String saveRegistration(@ModelAttribute Employee employee) {
//		employeeService.saveEmployee(employee);
//		return "register"; //--> this is act like request dispatcher in servlets controller layer  
//	}
//	@RequestMapping("/save")
//	public String saveRegistration(
//			@RequestParam String name,
//			@RequestParam String email,
//			@RequestParam String mobile
//			) {
//		employeeService.saveEmployee(name,email,mobile);
//		return "register"; //--> this is act like request dispatcher in servlets controller layer  
//	}
	@RequestMapping("/save")
	public String saveRegistration(
		EmployeeDto employeeDto
			) {
		employeeService.saveEmployee(employeeDto);
		return "register"; //--> this is act like request dispatcher in servlets controller layer  
	}
	
}
