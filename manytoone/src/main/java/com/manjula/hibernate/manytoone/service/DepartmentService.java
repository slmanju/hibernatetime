package com.manjula.hibernate.manytoone.service;

import java.util.List;

import com.manjula.hibernate.manytoone.service.dto.DepartmentDTO;
import com.manjula.hibernate.manytoone.service.dto.EmployeeDTO;

public interface DepartmentService {

    List<DepartmentDTO> findAllDepartments();

    List<EmployeeDTO> findAllEmployees();

}
