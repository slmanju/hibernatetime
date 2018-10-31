package com.manjula.hibernate.manytoone.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manjula.hibernate.manytoone.domain.model.Department;
import com.manjula.hibernate.manytoone.domain.model.Employee;
import com.manjula.hibernate.manytoone.domain.repository.DepartmentRepository;
import com.manjula.hibernate.manytoone.domain.repository.EmployeeRepository;
import com.manjula.hibernate.manytoone.service.dto.DepartmentDTO;
import com.manjula.hibernate.manytoone.service.dto.EmployeeDTO;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;

    @PostConstruct
    public void init() {
        Department department1 = Department.instance("Development");
        Department department2 = Department.instance("QA");

        department1 = departmentRepository.save(department1);
        department2 = departmentRepository.save(department2);

        Employee employee1 = Employee.instance("Iron Man", department1);
        Employee employee2 = Employee.instance("Bat Man", department1);
        Employee employee3 = Employee.instance("Ant Man", department2);
        Employee employee4 = Employee.instance("Hulk", department2);
        Employee employee5 = Employee.instance("Thor", department2);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
        employeeRepository.save(employee4);
        employeeRepository.save(employee5);
    }

    @Override
    public List<DepartmentDTO> findAllDepartments() {
    	return departmentRepository.findAll().stream().map(Department::toDto).collect(toList());
	}

    @Override
	public List<EmployeeDTO> findAllEmployees() {
    	return employeeRepository.findAll().stream().map(Employee::toDto).collect(toList());
	}

    @Autowired
	public void setDepartmentRepository(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

}
