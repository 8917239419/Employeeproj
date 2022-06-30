package com.kups.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kups.employee.model.Employee;
import com.kups.employee.repository.EmployeeRepo;



@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeController.class.getName());
	//Autowired the dependent class
	@Autowired
	private EmployeeRepo employeeRepo;
	
	//get all employee
	@GetMapping("/employees")
	public void getAllEmployees(){
		logger.info("method entry into getAllEmployees()");
		throw new NullPointerException();
		//return employeeRepo.findAll();
	}
	

}
