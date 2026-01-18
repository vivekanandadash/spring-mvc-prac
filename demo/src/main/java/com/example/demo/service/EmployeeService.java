package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepository;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

@Service  
public class EmployeeService {
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
// way no.1->	@ModelAttribute data reading way
	
//	public void saveEmployee(Employee employee) {
//		employeeRepository.save(employee);
//	}

	// way no.2->	@RequestParam data reading way
	
//	public void saveEmployee(String name, String email, String mobile) {
//		Employee employee = new Employee();
//		employee.setName(name);
//		employee.setEmail(email);
//		employee.setMobile(mobile);
//		employeeRepository.save(employee);
//	}
	
// way no.3->Dto ( Data transfer Object) / pay load class / pojo(plain old java object)
	public void saveEmployee(EmployeeDto dto) {
		

		
		Employee employee = new Employee();
		
//		we can do like this way
		 
//		employee.setName(dto.getName());
//		employee.setEmail(dto.getEmail());
//		employee.setMobile(dto.getMobile());
		
//		OR we can use another Class BeanUtils.copyProperties()
		BeanUtils.copyProperties(dto, employee);
		employeeRepository.save(employee);
	}
}
