package com.SqlServer.SBsqlServer.utils;

public class SqlQueries {
	
public static final String EMP_READ="SELECT * FROM employee";
public static final String EMP_INSERT="INSERT INTO employee(name,phone,email)values(?,?,?)";
public static final String EMP_UPDATE="UPDATE employee SET name=?,phone=?,email=? WHERE eid=?";
public static final String EMP_DELETE="DELETE employee WHERE eid=?";

}
