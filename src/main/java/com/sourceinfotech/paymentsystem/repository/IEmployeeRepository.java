package com.sourceinfotech.paymentsystem.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.sourceinfotech.paymentsystem.entity.Employee;
/**
 * @author Ketan
 *
 */

public interface IEmployeeRepository extends Repository<Employee, Integer>{
	public Employee save(Employee employee);
	public List<Employee> findAll();
	public List<Employee> findByRole(String role);
	boolean existsByNameAndRole(String name, String role);
}
