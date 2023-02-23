package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.model.Employee;

@Service
public interface service {
	
	public Employee addEmployee(Employee emp);
	
	public List<Employee>getAllEmployee();
	
	public void deleteEmployeeById(int empId);
	
	public Employee updateEmployee(Employee emp);

	

}
