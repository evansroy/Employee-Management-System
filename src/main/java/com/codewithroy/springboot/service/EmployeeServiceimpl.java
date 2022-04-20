package com.codewithroy.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithroy.springboot.model.Employee;
import com.codewithroy.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id :: " + id);
		}
		
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteById(id);
		
	}

}
