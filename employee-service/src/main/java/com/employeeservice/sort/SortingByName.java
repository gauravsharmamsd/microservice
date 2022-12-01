package com.employeeservice.sort;

import java.util.Comparator;

import com.employeeservice.model.EmployeeResponse;

public class SortingByName implements Comparator<EmployeeResponse> {
    
	

	@Override
	public int compare(EmployeeResponse o1, EmployeeResponse o2) {
		
		return o2.getName().compareToIgnoreCase(o1.getName());
	}

}
