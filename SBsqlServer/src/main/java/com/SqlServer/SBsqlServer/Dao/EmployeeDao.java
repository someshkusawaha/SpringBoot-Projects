package com.SqlServer.SBsqlServer.Dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.SqlServer.SBsqlServer.Entity.Employee;
import com.SqlServer.SBsqlServer.utils.SqlQueries;
import com.SqlServer.SBsqlServer.utils.WebConstants;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Employee> rowMapper = (ResultSet rs,int rowNum)->{
		Employee emp = new Employee();
		emp.setEid(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setPhone(rs.getString(3));
		emp.setEmail(rs.getString(4));
		return emp;
	};
	public List<Employee> getAll() {
		return jdbcTemplate.query(SqlQueries.EMP_READ, rowMapper);
	}
	public String add(Employee employee) {
		if(jdbcTemplate.update(SqlQueries.EMP_INSERT,employee.getName(),employee.getPhone(),employee.getEmail())>0) {
			return WebConstants.EMP_SUCCESS_ADDED;
		}else {
			return WebConstants.EMP_FAIL_ADDED;
		}
	}
	public String update(Employee employee) {
		if(jdbcTemplate.update(SqlQueries.EMP_UPDATE,employee.getName(),employee.getPhone(),employee.getEmail(),employee.getEid())>0) {
			return WebConstants.EMP_SUCCESS_UPDATED;
		}else {
			return WebConstants.EMP_FAIL_UPDATED;
		}
	}
	public String delete(int eid) {
		if(jdbcTemplate.update(SqlQueries.EMP_DELETE,eid)>0) {
			return WebConstants.EMP_SUCCESS_DELETED;
		}else {
			return WebConstants.EMP_FAIL_DELETED;
		}
	}

}
