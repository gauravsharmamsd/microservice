package com.employeeservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeservice.model.EmployeeResponse;
import com.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee/{id}")
	public EmployeeResponse getEmployeeById(@PathVariable("id") int id) {
		return employeeService.geEmployeeResponse(id);

	}

	@GetMapping("/employee")
	public List<EmployeeResponse> getAllEmployee() {
		return employeeService.geEmployeeResponse();

	}

	@PostMapping("/employee")
	public void addEmployee(@RequestBody EmployeeResponse employeeResponse) {
		employeeService.saveEmployee(employeeResponse);
	}
}
