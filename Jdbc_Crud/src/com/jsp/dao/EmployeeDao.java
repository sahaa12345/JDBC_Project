package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Employee;
import com.mysql.cj.jdbc.Driver;

public class EmployeeDao {
	String url="jdbc:mysql://localhost:3306/jdbc_crud";
	String username="root";
	String password="root";
	public void createEmployeeTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection connection=DriverManager.getConnection(url,username,password);
				Statement statement=connection.createStatement();
				statement.execute("create table Employee(id int primary key,ename varchar(45),age integer,sal integer,address varchar(50))");
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int insertEmployeeTable(Employee employee) {
		try {
			DriverManager.registerDriver(new Driver());
		    Connection connection=DriverManager.getConnection(url,username,password);
		    PreparedStatement ps=connection.prepareStatement("insert into Employee values(?,?,?,?,?)");
		    ps.setInt(1,employee.getId());
		    ps.setString(2,employee.getEname());
		    ps.setInt(3,employee.getAge());
		    ps.setInt(4,employee.getSal());
		    ps.setString(5,employee.getAddress());
		    int res=ps.executeUpdate();
		    connection.close();
		    return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int updateEmployeeTable(Employee employee) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection=DriverManager.getConnection(url,username,password);
			PreparedStatement ps=connection.prepareStatement("update Employee set ename=?,age=?,sal=?,address=? where id=?");
			ps.setString(1,employee.getEname());
			ps.setInt(2,employee.getAge());
			ps.setInt(3,employee.getSal());
			ps.setString(4,employee.getAddress());
			ps.setInt(5,employee.getId());
			int res=ps.executeUpdate();
			connection.close();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteEmployeeTable(Employee employee) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection connection=DriverManager.getConnection(url,username,password);
				PreparedStatement ps=connection.prepareStatement("delete from Employee where id=?");
				ps.setInt(1,employee.getId());
				int res=ps.executeUpdate();
				connection.close();
				return res;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public Employee getById(int id) {
		Employee emp=new Employee();
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection=DriverManager.getConnection(url, username, password);
			PreparedStatement ps=connection.prepareStatement("select * from Employee where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				emp.setId(rs.getInt("id"));
				emp.setEname(rs.getString("ename"));
				emp.setAge(rs.getInt("age"));
				emp.setSal(rs.getInt("sal"));
				emp.setAddress(rs.getString("address"));
				
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	public List getAllEmployee() {
		List<Employee> list=new ArrayList();
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from Employee");
			while(resultSet.next()) {
				Employee emp=new Employee();
				emp.setId(resultSet.getInt("id"));
				emp.setEname(resultSet.getString("ename"));
				emp.setAge(resultSet.getInt("age"));
				emp.setSal(resultSet.getInt("sal"));
				emp.setAddress(resultSet.getString("address"));
				list.add(emp);
			}
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
			}
		return list;
		}
	

}
