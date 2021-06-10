package com.bookstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StudentController {
	//Controller
	@RequestMapping("/")
	public String home() {
	System.out.println();	
		return "rayhan";
	}
}
