package com.ibm;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.entity.Employee;
import com.ibm.service.EmployeeService;

@SpringBootApplication
public class MocApplication {

	@Autowired
	private EmployeeService employeeService;

	@PostConstruct
	public void init() {
		List<Employee> list = employeeService.xyz(1);
		list.forEach(x->System.out.println(x));
	}

	public static void main(String[] args) {
		SpringApplication.run(MocApplication.class, args);
	}

}
