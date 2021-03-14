package com.jpa.demoJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demoJpa.dao.UserDao;
import com.jpa.demoJpa.entity.Employee;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public List<Employee> getAllEmployee() {
		return userDao.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return userDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return userDao.save(employee);
	}

	@Override
	public void deleteEmployee(int userId) {
		userDao.deleteById(userId);
	}
}
