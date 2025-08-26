package com.example.Springproject;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeDao empdao;

	@GetMapping("/")
	public EmployeeStroage getAllEmployee() {
		return empdao.getAllEmployee();
	}

	@PostMapping("/")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		Integer id = empdao.getAllEmployee().getEmployeeList().size() + 1;
		employee.setId(id);

		// Add employee to the list
		empdao.addEmployee(employee);

		// Build location URI for the new employee
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}

}
