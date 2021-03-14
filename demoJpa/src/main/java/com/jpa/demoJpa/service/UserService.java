package com.jpa.demoJpa.service;

import java.util.List;

import com.jpa.demoJpa.entity.Employee;

public interface UserService {

	List<Employee> getAllEmployee();

	Employee saveEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int userId);

}
