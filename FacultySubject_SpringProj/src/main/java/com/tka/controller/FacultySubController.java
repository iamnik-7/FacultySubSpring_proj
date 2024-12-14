package com.tka.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.FacultySubService;

@RestController
public class FacultySubController {
	
	@Autowired
	FacultySubService service;
	
	@GetMapping("/")
	public String Test() 
	{
		return "Testing";
	}
	
	@GetMapping("/getallsubInfo")
	public ArrayList<String> getAllFacultySubNames()
	{
		return service.getAllFacultySubNames();
		
	}
	
	
	
}
