package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@Controller
@RequestMapping("api/v1/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
    @GetMapping("/view")
	public String viewRegistration() {
		return "employeeRegister";
	}
//    localhost:8080/api/v1/employee/view
    @PostMapping("/save")
    public String saveRegistration(
    		@RequestParam String name,
    		@RequestParam String email,
    		@RequestParam String mobile
    		) {
    	employeeService.saveEmployee(name,email,mobile);
    	return "employeeRegister";
    }
}
