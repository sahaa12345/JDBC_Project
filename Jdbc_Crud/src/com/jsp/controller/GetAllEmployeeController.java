package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class GetAllEmployeeController {

	public static void main(String[] args) {
		 EmployeeService es = new EmployeeService();
	       List<Employee> li = es.getAllEmployeeService();
	        if (li != null) {
	        	for(Employee employee:li) {
	            System.out.println("Person ID is: " +employee.getId());
	            System.out.println("Person name is: " +employee.getEname());
	            System.out.println("Person age is: " +employee.getAge());
	            System.out.println("Person salary is: " +employee.getSal());
	            System.out.println("Person address is: " +employee.getAddress());
	            System.out.println("------------------------------------------------------------");
	        	}
	        } else {
	            System.out.println("Person with ID is not found.");
	        }

	}

}
