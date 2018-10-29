package com.manjula.hibernate.hibernatebasics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manjula.hibernate.hibernatebasics.domain.model.Employee;
import com.manjula.hibernate.hibernatebasics.domain.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    
    public Long save(Employee employee) {
    	Employee entity = employeeRepository.save(employee);
    	return entity.getId();
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).map(employee -> employee).orElse(null);
    }

	@Override
	public void update(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

}
