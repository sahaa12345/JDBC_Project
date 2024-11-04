package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class GetByIdController {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		int id=35;
		Employee e=es.getByIdService(id);
		if(e!=null) {
			System.out.println("Employee id is: "+e.getId());
			System.out.println("Employee name is: "+e.getEname());
			System.out.println("Employee age is: "+e.getAge());
			System.out.println("Employee salary is: "+e.getSal());
			System.out.println("Employee address is: "+e.getAddress());
		}
		else {
			System.out.println("please check the code.");
		}
	}

}
