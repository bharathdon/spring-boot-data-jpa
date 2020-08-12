package com.ibm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.dao.EmployeeDao;
import com.ibm.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}
	
	public Employee findById(Integer eno) {
		 Optional<Employee> empId = employeeDao.findById(eno);
		 if (empId.isPresent()) {
			 return empId.get();
		}
		return null;
	}
	
	public List<Employee> findByName(String name) {
		return employeeDao.findByName(name);
		
	}
	
	public List<Employee> xyz(Integer eno){
		return employeeDao.xyz(eno);
		
	}
	public Iterable<Employee> findAll(){
		return employeeDao.findAll();
	}
	
	public Employee findByNameStartingWith(String name) {
		return employeeDao.findByNameStartingWith(name);
	}
	
	
}
