package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Employee;
import repository.EmployeeRepository;

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