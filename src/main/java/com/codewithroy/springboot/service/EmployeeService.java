package com.codewithroy.springboot.service;

import java.util.List;

import com.codewithroy.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	//Employee getEmployeeById(long id);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
}
