package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.model.Employee;
import com.cg.repository.Repository;



public class ServiceImp implements service {
	
private Repository repository;
	
	@Autowired
	public ServiceImp(Repository repository) {
		super();
		this.repository = repository;
	}
	
	
	
	
	//post mapping
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
				Employee savedEmployee = repository.save(employee);
				return savedEmployee;
	}
   //get mapping
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
				return (List<Employee>) repository.findAll();
	}

	//put mapping
	@Override
	public Employee updateEmployee(Employee employee) {
		Employee record;
		Optional<Employee> opt=repository.findById(employee.getEmpId());
		if(opt.isPresent()) {
			record=opt.get();
			record.setEmpId(employee.getEmpId());
			record.setEmpName(employee.getEmpName());
			record.setEmpDept(employee.getEmpDept());
			record.setEmpSalary(employee.getEmpSalary());
			repository.save(record);
		}else {
			return new Employee();
		}
		return record;
	}
     //delete mapping
	@Override
	public void deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		repository.deleteById( empId);
	}




}
