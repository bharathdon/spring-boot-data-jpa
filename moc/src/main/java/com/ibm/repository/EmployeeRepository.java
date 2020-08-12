package com.ibm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ibm.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
public List<Employee> findByAddress(String name);

public List<Employee> findByAddressAndName(String name,String address);

//query hints
@Query(value = "select ifnull(salary,100) from emp_tbl where eno=:eno",nativeQuery = true)
public List<Employee> xyz(Integer eno);

public Employee findByNameStartingWith(String name);

	
}
