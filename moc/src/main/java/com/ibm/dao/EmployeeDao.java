package com.ibm.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Employee;
import com.ibm.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee	save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Optional<Employee> findById(Integer eno) {
		return employeeRepository.findById(eno);
		
	}
	
	
	
	public List<Employee> findByName(String name){
		return employeeRepository.findByAddress(name);
		
	}
	
	public List<Employee> xyz(Integer eno){
		return employeeRepository.xyz(eno);
		
	}
	
	public Iterable<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee findByNameStartingWith(String name) {
		return employeeRepository.findByNameStartingWith(name);
	}
	
	
}
