package com.manjula.hibernate.hibernatebasics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manjula.hibernate.hibernatebasics.domain.model.Employee;
import com.manjula.hibernate.hibernatebasics.service.EmployeeService;

@RestController
@RequestMapping("/api/employees/")
public class EmployeeController {
	
	private EmployeeService employeeService;

	@GetMapping("/hello")
	public String index() {
		return "Hello world";
	}
	
	@PostMapping("/save")
	public Long save(Employee employee) {
		return employeeService.save(employee);
	}
	
	@GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
		return employeeService.findById(id);
	}
	
	@GetMapping("/all")
    public List<Employee> findAll() {
    	return employeeService.findAll();
    }
    
	@PutMapping("/{id}")
    public void update(Employee employee) {
		employeeService.update(employee);
	}
    
	@DeleteMapping("/{id}")
    public void delete(Long id) {
    	employeeService.delete(id);
    }

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
}
