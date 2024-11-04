package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class InsertController {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(111);
		e.setEname("akki");
		e.setAge(19);
		e.setSal(9000000);
		e.setAddress("hyd");
		EmployeeService es=new EmployeeService();
		int res=es.insertService(e);
		if(res>0) {
			System.out.println("insertion is successful..................");
		}
		else {
			System.out.println("please check the code.");
		}
	}

}
