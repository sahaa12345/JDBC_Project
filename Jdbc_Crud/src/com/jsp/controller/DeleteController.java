package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class DeleteController {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(71);
		EmployeeService es=new EmployeeService();
		int i=es.deleteService(e);
		if(i>0) {
			System.out.println("deletion is successful..............");
		}
		else {
			System.out.println("please check the code.");
		}

	}

}
