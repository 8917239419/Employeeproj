package com.kups.employee.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void getEmployee(String firstName,String lastName,long id) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(id);
		
	}
}
