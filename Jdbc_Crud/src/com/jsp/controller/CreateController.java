package com.jsp.controller;

import com.jsp.service.EmployeeService;

public class CreateController {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		es.createService();
		System.out.println("Table is created succesfully...................................");
	}

}
