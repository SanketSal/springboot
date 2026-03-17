package com.rajtech.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajtech.springdatajpa.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	

}
