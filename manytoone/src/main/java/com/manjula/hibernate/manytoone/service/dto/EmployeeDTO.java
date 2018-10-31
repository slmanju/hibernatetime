package com.manjula.hibernate.manytoone.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class EmployeeDTO {

    private String id;
    private String name;
    private DepartmentDTO department;

}
