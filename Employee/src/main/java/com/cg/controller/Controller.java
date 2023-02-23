package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Employee;
import com.cg.repository.Repository;
import com.cg.service.service;




@RestController
@RequestMapping("/api/v1")
public class Controller {
	
	
		@Autowired
		private Repository repository;
		
		private service Serv;
		
		//post mapping
		
		@PostMapping("/addEmployee")
		public String saveEmployee(@RequestBody Employee employee) {
			repository.save(employee);
			return "add with id: "+ employee.getEmpId();
		}
		//get mapping
		
		@GetMapping("/findAllEmployee")
		public List<Employee> getEmployees(){
			return repository.findAll();
		}
		
		@PutMapping("/update") // it is used to update data into database
		private Employee update(@RequestBody Employee employee)   
		{  
		Serv.updateEmployee(employee);  
		return employee;  
		}  
		
		@DeleteMapping("/delete/{id}") // it is used to delete data into database
		public ResponseEntity<Void> deleteemployeeById(@PathVariable int empId) {
		repository.deleteById(empId);
		return ResponseEntity.noContent().build();
		}

}
