package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;
import com.example.demo.dto.EmployeeDto;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	public List<Employee> findByName(String name);
	
	public Optional<Employee> findByEmail(String email);
	
	public Optional<Employee> findByMobileNumber(String mobile);
	
	public List<Employee> findBySkills(String skills);
	
}
