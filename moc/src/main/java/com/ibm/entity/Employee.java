package com.ibm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private Integer eno;
	private String name;
	private Double salary;
	private String gender;
	private String address;

	public Employee(Integer eno) {
		super();
		this.eno = eno;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(Double salary) {
		super();
		this.salary = salary;
	}

}
