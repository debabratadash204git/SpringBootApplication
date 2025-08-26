package com.example.Springproject;

import com.example.Springproject.Employee;
import java.util.*;

public class EmployeeStroage {
	
	public List<Employee> employeeList; 
	
	public List getEmployeeList() {
		
		if(employeeList == null) {
			employeeList = new ArrayList<>();
		}
		return employeeList;
	}
	
	public void setEmployeeList(List<Employee> employeeList) {
		
		this.employeeList = employeeList;
	}

}
