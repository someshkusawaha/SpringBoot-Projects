package com.jpa.demoJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demoJpa.entity.Employee;
import com.jpa.demoJpa.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		List<Employee> employeeList= userService.getAllEmployee();
		return employeeList;
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee response = userService.saveEmployee(employee);
		return response;
	}
	
	@PutMapping("/updateEmpoyee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee response = userService.updateEmployee(employee);
		return response;
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee(@PathVariable int userId) {
	     userService.deleteEmployee(userId);
		
	}
}