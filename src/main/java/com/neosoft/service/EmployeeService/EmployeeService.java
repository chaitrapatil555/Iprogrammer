package com.neosoft.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.entity.Employee.Employee;
import com.neosoft.repository.EmployeeRepository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}
	public List <Employee> GetEmployee(){
		return employeeRepo.findAll();
	}

}