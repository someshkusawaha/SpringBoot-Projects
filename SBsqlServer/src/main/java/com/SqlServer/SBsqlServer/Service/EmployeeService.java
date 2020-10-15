package com.SqlServer.SBsqlServer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SqlServer.SBsqlServer.Dao.EmployeeDao;
import com.SqlServer.SBsqlServer.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	public String add(Employee employee) {
		return employeeDao.add(employee);
	}

	public String update(Employee employee) {
		return employeeDao.update(employee);
	}

	public String delete(int eid) {
		return employeeDao.delete(eid);
	}

}
