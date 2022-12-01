package com.employeeservice.model;

import lombok.Data;

@Data
public class EmployeeResponse {
	private int id;
	private String name;
	private String bloodgroup;
	private String email;
	private AddressResponse addressResponse;
}
