package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	EmployeeDao e=new EmployeeDao();
	public void createService() {
		e.createEmployeeTable();
	}
	public int insertService(Employee employee) {
		return e.insertEmployeeTable(employee);
	}
	public int updateService(Employee employee) {
		return e.updateEmployeeTable(employee);
	}
	public int deleteService(Employee employee) {
		return e.deleteEmployeeTable(employee);
	}
	public Employee getByIdService(int id) {
		return e.getById(id);
	}
	public List getAllEmployeeService() {
		return e.getAllEmployee();
	}
}