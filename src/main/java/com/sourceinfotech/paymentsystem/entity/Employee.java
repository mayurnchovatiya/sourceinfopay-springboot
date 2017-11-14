package com.sourceinfotech.paymentsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Ketan
 *
 */

@Entity
public class Employee {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int employeeId;
	private String name;
	private String role;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String name, String role) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.role = role;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}