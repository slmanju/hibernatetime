package com.manjula.hibernate.hibernatebasics.service;

import java.util.List;

import com.manjula.hibernate.hibernatebasics.domain.model.Employee;

public interface EmployeeService {
	
	Long save(Employee employee);

    List<Employee> findAll();

    Employee findById(Long id);
    
    void update(Employee employee);
    
    void delete(Long id);

}
