package com.SqlServer.SBsqlServer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SqlServer.SBsqlServer.Entity.Employee;
import com.SqlServer.SBsqlServer.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/read")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Employee employee){
		return employeeService.add(employee);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Employee employee){
		return employeeService.update(employee);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String delete(@PathVariable("eid") int eid){
		return employeeService.delete(eid);
	}
}
