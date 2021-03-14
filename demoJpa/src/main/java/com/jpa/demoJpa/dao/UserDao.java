package com.jpa.demoJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demoJpa.entity.Employee;

@Repository
public interface UserDao extends JpaRepository<Employee,Integer>{

}
