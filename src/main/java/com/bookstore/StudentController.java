package com.bookstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	//This is the controller
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
}
