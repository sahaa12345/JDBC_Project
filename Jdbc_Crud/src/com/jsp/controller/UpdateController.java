package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class UpdateController {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(35);
		e.setEname("aardhya");
		e.setAge(42);
		e.setSal(780000000);
		e.setAddress("pune");
		EmployeeService es=new EmployeeService();
		int a=es.updateService(e);
		if(a>0) {
			System.out.println("updation is successful.......");
		}
		else {
			System.out.println("please check the code.");
		}

	}

}
