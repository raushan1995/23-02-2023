package com.cg.repository;


import org.springframework.data.mongodb.repository.MongoRepository;


import com.cg.model.Employee;


public interface Repository extends MongoRepository<Employee, Integer> {

}
