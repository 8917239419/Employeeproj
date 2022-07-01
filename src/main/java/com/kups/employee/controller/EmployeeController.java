package com.kups.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kups.employee.model.Employee;
import com.kups.employee.repository.EmployeeRepo;
import com.kups.employee.service.EmployeeService;
//import com.kups.service.EmployeeService;



@RestController
@RequestMapping("/api/v1/")

public class EmployeeController {
	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeController.class.getName());
	//Autowired the dependent class
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private EmployeeService employeeService;
	
	//get all employee
	@GetMapping("/employees/{id}")//template param
	public List<Employee> getAllEmployees(@PathVariable long id,
			@RequestParam(required = false) String firstName,
			@RequestParam(required = false) String lastName){
		employeeService.getEmployee(firstName, lastName, id);
		System.out.println("id" +id);
		System.out.println("firstName" +firstName);
		System.out.println("lastName" +lastName);
		logger.info("method entry into getAllEmployees()");
		//throw new NullPointerException();
		return employeeRepo.findAll();
	}
	
	

}
