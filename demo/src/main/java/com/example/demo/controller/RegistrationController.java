package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
 //Handler methods
//http://localhost:8080/view
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "register"; //--> this is act like request dispatcher in servlets controller layer  
		
	}
}
