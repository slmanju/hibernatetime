package com.manjula.hibernate.manytoone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manjula.hibernate.manytoone.service.DepartmentService;
import com.manjula.hibernate.manytoone.service.dto.DepartmentDTO;
import com.manjula.hibernate.manytoone.service.dto.EmployeeDTO;

import java.util.List;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<DepartmentDTO> departments() {
        return departmentService.findAllDepartments();
    }

    @GetMapping("/employees")
    public List<EmployeeDTO> employees() {
        return departmentService.findAllEmployees();
    }

    @Autowired
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
    
}
