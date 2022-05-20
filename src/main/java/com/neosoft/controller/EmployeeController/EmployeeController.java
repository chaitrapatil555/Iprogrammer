package com.neosoft.controller.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.entity.Employee.Employee;
import com.neosoft.repository.EmployeeRepository.EmployeeRepository;
import com.neosoft.service.EmployeeService.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/EmployeeDetails")
	public void AddEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		
	}
	@GetMapping("/EmployeeDetails")
	public List<Employee>GetEmployee(){
		return employeeService.GetEmployee();	
		}
	@GetMapping("/Employee/search/department/{department}")
	public List<Employee> searchByDepartment(@PathVariable String department){
		return employeeRepo.findByDepartment(department);
	}

	@PutMapping("/Employee/update/{id}")
	public void updateById(@PathVariable Long id,@RequestBody Employee employee) {
		Employee e1= employeeRepo.getById(id);
		e1.setFirstName(employee.getFirstName());
		e1.setLastName(employee.getLastName());
		e1.setCity(employee.getCity());
		e1.setAge(employee.getAge());
		e1.setSalary(employee.getSalary());
		e1.setDepartment(employee.getDepartment());
		employeeRepo.save(e1);
		}
	}
