package com.example.Springproject;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	private static EmployeeStroage empList = new EmployeeStroage();

	static {

		empList.getEmployeeList().add(new Employee(1, "Prem", "Tiwari", "prem@gmail.com"));
		empList.getEmployeeList().add(new Employee(2, "Vikash", "Kumar", "vikash@gmail.com"));
		empList.getEmployeeList().add(new Employee(3, "Ritesh", "Ojha", "ritesh@gmail.com"));
	}
	
	public EmployeeStroage getAllEmployee() {
		return empList;
	}
	
	public void addEmployee(Employee emp) {
		
		empList.getEmployeeList().add(emp);
	}

}
